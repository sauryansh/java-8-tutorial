package _08functioninterface._4function;

import _08functioninterface._3predicate.PredicateStudentExample2;
import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class _23BiFunctionalExample {
    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (students, studentPredicate) -> {
        Map<String, Double> studentGradeMap = new HashMap<>();
        students.forEach(student -> {
            if (studentPredicate.test(student)) studentGradeMap.put(student.getName(), student.getGpa());
        });
        return studentGradeMap;
    };

    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDatabase.getAllStudentDetails(), PredicateStudentExample2.p2.and(PredicateStudentExample2.p1)));
    }
}
