package _09methodreference;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.function.Consumer;

public class _27ConsumerMethodReferenceExample {
    /**
     * classname::methodName;
     */
    static Consumer<Student> c1 = p-> System.out.println(p);
    static Consumer<Student> c2 = System.out::println; //Replace by method reference
    static Consumer<Student> c3 = Student::printListOfActivities; //Classname::instanceMethodName;
    public static void main(String[] args) {
        StudentDatabase.getAllStudentDetails().forEach(c1);
        System.out.println("------------------------------");
        StudentDatabase.getAllStudentDetails().forEach(c2);
        System.out.println("------------------------------");
        StudentDatabase.getAllStudentDetails().forEach(c3);
    }
}

