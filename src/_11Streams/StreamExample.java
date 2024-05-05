package _11Streams;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        //Predicate
        Predicate<Student> studentPredicate = (student)-> student.getGradeLevel()>=3;
        Predicate<Student> studentGpaPredicate =(student)-> student.getGpa()>=3.9;

        //name and activity
        List<Student> students = StudentDatabase.getAllStudentDetails();
        final Map<String, List<String>> collectStudentDetails = students
                 .stream()
                .peek((student -> {
                    System.out.println("Student until now stream: "+student);
                    //System.out.println("------");
                }))
                .filter(studentPredicate) // Stream<Student>
                .peek((student -> {
                    System.out.println("Student until now 1st filter: "+student);
                    System.out.println("----------------");
                }))
                .filter(studentGpaPredicate)// Stream<Student>
                .peek((student -> {
                    System.out.println("Student until now 2nd filter: "+student);
                    System.out.println("----------------------");
                }))
                .collect(Collectors.toMap(Student::getName, Student::getActivities)); //Actual method returned

        System.out.println(collectStudentDetails);

    }
}
