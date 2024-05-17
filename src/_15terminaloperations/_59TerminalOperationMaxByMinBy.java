package _15terminaloperations;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class _59TerminalOperationMaxByMinBy {
    public static Optional<Student> minByExample(){
        return StudentDatabase.getAllStudentDetails()
                .stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
    }
    public static Optional<Student> maxByExample(){
        return StudentDatabase.getAllStudentDetails()
                .stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }
    public static void main(String[] args) {
        System.out.println("Least GPA: "+ minByExample().get());
        System.out.println("Max GPA: "+ maxByExample().get());
    }
}
/**
 * maxBy() and minBy() takes comparator as input and Optional as output.
 */
