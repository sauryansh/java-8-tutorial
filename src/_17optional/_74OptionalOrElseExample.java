package _17optional;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.Optional;

public class _74OptionalOrElseExample {
    //orElse
    public static String optionalOrElse(){
        //final Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        final Optional<Student> studentOptional = Optional.ofNullable(null);
        return studentOptional.map(Student::getName).orElse("Default");
    }
    public static String optionalOrElseGet(){
        final Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        //final Optional<Student> studentOptional = Optional.ofNullable(null);
        return studentOptional.map(Student::getName).orElseGet(()-> "Default");
    }
    public static String optionalOrElseThrow(){
        //final Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        final Optional<Student> studentOptional = Optional.ofNullable(null);
        return studentOptional.map(Student::getName)
                .orElseThrow(()-> new RuntimeException("No Data available"));
    }
    public static void main(String[] args) {
        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGet());
        System.out.println(optionalOrElseThrow());
    }
}
