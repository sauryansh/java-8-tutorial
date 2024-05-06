package _12streamapiops;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _39StreamComparatorExample {
    public static List<Student> sortedStudentsByName(){
        return StudentDatabase.getAllStudentDetails()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortedStudentsByGpa(){
        return StudentDatabase.getAllStudentDetails()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa)) //Stream<Student>
                .collect(Collectors.toList());
    }
    public static List<Student> sortedStudentsByGradeLevelReverse(){
        return StudentDatabase.getAllStudentDetails()
                .stream()
                .sorted(Comparator.comparing(Student::getGradeLevel).reversed())
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println("Sorted by Name: ");
        sortedStudentsByName().forEach(System.out::println);
        System.out.println("-------------------------------");
        System.out.println("Sorted by GPA: ");
        sortedStudentsByGpa().forEach(System.out::println);
        System.out.println("-------------------------------");
        System.out.println("Sorted by GradeLevel: ");
        sortedStudentsByGradeLevelReverse().forEach(System.out::println);
        System.out.println("-------------------------------");

    }
}
