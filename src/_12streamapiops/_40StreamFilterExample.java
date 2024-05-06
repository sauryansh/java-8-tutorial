package _12streamapiops;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

public class _40StreamFilterExample {
    static final Predicate<Student> studentFilterForFemale = student -> student.getGender().equals("female");
    public static void main(String[] args) {
        filterStudents().forEach(System.out::println);
    }

    public static List<Student> filterStudents(){

        return StudentDatabase.getAllStudentDetails()
                .stream().filter(studentFilterForFemale)
                .collect(toList());
    }
}
