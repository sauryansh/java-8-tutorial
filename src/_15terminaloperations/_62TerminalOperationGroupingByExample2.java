package _15terminaloperations;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

public class _62TerminalOperationGroupingByExample2 {
    public static void main(String[] args) {
        System.out.println(twoLevelGrouping_4());
    }

    public static Map<Integer, Map<String, List<Student>>> twoLevelGrouping(){
        return StudentDatabase.getAllStudentDetails()
                .stream()
                .collect(
                        groupingBy(
                                Student::getGradeLevel,
                                    groupingBy(student-> student.getGpa()>=3.8?"OUTSTANDING":"AVERAGE")
                        )
                );

    }
    public static Map<Integer, Integer> twoLevelGrouping_2(){
        return StudentDatabase.getAllStudentDetails()
                .stream()
                .collect(
                        groupingBy(
                                Student::getGradeLevel,
                                summingInt(Student::getNotebooks)
                        )
                );

    }
    public static Map<String, Integer> twoLevelGrouping_3(){
        return StudentDatabase.getAllStudentDetails()
                .stream()
                .collect(
                        groupingBy(
                                Student::getName,
                                summingInt(Student::getNotebooks)
                        )
                );

    }

    public static Map<Integer, Map<String, Integer>> twoLevelGrouping_4(){
        return StudentDatabase.getAllStudentDetails()
                .stream()
                .collect(
                        groupingBy(
                                Student::getGradeLevel,
                                groupingBy(
                                        Student::getName,
                                        summingInt(Student::getNotebooks)
                                )
                        )
                );

    }

}
