package _17optional;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.Optional;

public class _72OptionalExample {
    public static void main(String[] args) {
        String name = getStudentName();
        if(name!=null){
            System.out.println("Length of the student name: "+name.length());
        }else{
            System.out.println("Name not found");
        }

        Optional<String> stringOptional = getStudentNameII();
        stringOptional.ifPresent(s -> System.out.println(s.length()));

        final Optional<String> studentOptionalEmpty = studentOptionalEmpty();
        studentOptionalEmpty.ifPresentOrElse(System.out::println,() -> System.out.println("Empty"));
    }

    public static String getStudentName(){
        //final Student student = StudentDatabase.studentSupplier.get();
        final Student student = null;
        if(student!=null){
            return student.getName();
        }

        return null;
    }


    public static Optional<String> getStudentNameII(){
        final Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier
                .get());
        if(studentOptional.isPresent()){
            return studentOptional.map(Student::getName);
        }

        return Optional.empty();
    }
    public static Optional<String> studentOptionalEmpty(){
        final Optional<Student> studentOptionalEmpty = Optional.ofNullable(null);
        if(studentOptionalEmpty.isPresent()){
            return studentOptionalEmpty.map(Student::getName);
        }

        return Optional.empty();
    }


}
