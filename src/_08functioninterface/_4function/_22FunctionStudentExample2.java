package _08functioninterface._4function;

import _00utility.Student;
import _00utility.StudentDatabase;
import _08functioninterface._3predicate.PredicateStudentExample2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class _22FunctionStudentExample2 {
    static Function<List<Student>, Map<String, Double>> studentFunction = (students) -> {
        Map<String, Double> studentGradeMap = new HashMap<>();
        students.forEach(student -> {
            if(PredicateStudentExample2.p1.test(student))
                studentGradeMap.put(student.getName(), student.getGpa());
        });
        return studentGradeMap;
    };

    public static void main(String[] args) {
        List<Student> studentDetails = StudentDatabase.getAllStudentDetails();
        final Map<String, Double> result = studentFunction.apply(studentDetails);
        System.out.println(result);
    }
}
