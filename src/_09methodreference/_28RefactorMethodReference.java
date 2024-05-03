package _09methodreference;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.function.Predicate;

public class _28RefactorMethodReference {
    static Predicate<Student> p1 = _28RefactorMethodReference::greaterThanGradeLevel;
    public static void main(String[] args) {
        System.out.println(p1.test(StudentDatabase.studentSupplier.get()));
    }

    public static boolean greaterThanGradeLevel(Student s){
        return s.getGradeLevel()>=3;
    }
}
/**
 * Every method cannot be written as method reference;
 */