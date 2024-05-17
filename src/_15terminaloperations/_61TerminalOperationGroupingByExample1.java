package _15terminaloperations;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class _61TerminalOperationGroupingByExample1 {
    public static void main(String[] args) {
        System.out.println(groupStudentsByGender());
        System.out.println("-----------------------------");
        System.out.println(customisedGroupBy());
    }

    public static Map<String, List<Student>> groupStudentsByGender(){
        return StudentDatabase.getAllStudentDetails()
                .stream()
                .collect(groupingBy(Student::getGender));
    }
    public static Map<String, List<Student>> customisedGroupBy(){
        return StudentDatabase.getAllStudentDetails()
                .stream()
                .collect(groupingBy(student -> student.getGpa()>=3.8?"OUTSTANDING":"AVERAGE"));
    }
}
