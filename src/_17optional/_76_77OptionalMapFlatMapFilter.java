package _17optional;

import _00utility.Bike;
import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.Optional;

public class _76_77OptionalMapFlatMapFilter {
    public static void main(String[] args) {
        System.out.println("Printing optionalFilter");
        optionalFilter();
        System.out.println("Printing optionalMap");
        optionalMap();
        System.out.println("Printing optionalFlatMap");
        optionalFlatMap();
    }

    public static void optionalFilter(){
        final Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        studentOptional.filter(student -> student.getGpa()>=3.5)
                .ifPresent(System.out::println);
    }

    public static void optionalMap(){
        final Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        if(studentOptional.isPresent()){
            final Optional<String> optionalStudent = studentOptional.filter(student -> student.getGpa() >= 3.5)
                    .map(Student::getName);
            //System.out.println(optionalStudent.get());
            optionalStudent.ifPresent(System.out::println);
        }
    }

    public static void optionalFlatMap(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier
                .get());

        final Optional<String> bikeName = studentOptional.filter(student -> student.getGpa() >= 3.5)
                .flatMap(Student::getBike) //Optional inside Optional
                .map(Bike::getName);

        bikeName.ifPresentOrElse(s-> System.out.println("name: "+s),()-> System.out.println("bike model is not available"));
    }
}
