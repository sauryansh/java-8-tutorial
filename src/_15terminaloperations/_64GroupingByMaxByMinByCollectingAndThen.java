package _15terminaloperations;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.*;

public class _64GroupingByMaxByMinByCollectingAndThen {
    public static void main(String[] args) {
       // System.out.println(calculateTopGPA());
        System.out.println(calculateTopGPACollectingAndThen());
    }

    public static Map<Integer, Optional<Student>> calculateTopGPA(){
        final Map<Integer, Optional<Student>> studentMapOptional = StudentDatabase.getAllStudentDetails()
                .stream()
                .collect(groupingBy(
                        Student::getGradeLevel,
                        maxBy(Comparator.comparing(Student::getGpa))
                ));

        return studentMapOptional;
    }

    public static Map<Integer, Student> calculateTopGPACollectingAndThen(){
        final Map<Integer, Student> studentMapOptional = StudentDatabase.getAllStudentDetails()
                .stream()
                .collect(groupingBy(
                        Student::getGradeLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)), Optional::get)
                ));

        return studentMapOptional;
    }
}
