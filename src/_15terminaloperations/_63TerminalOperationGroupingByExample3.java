package _15terminaloperations;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.LinkedHashMap;
import java.util.Set;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

public class _63TerminalOperationGroupingByExample3 {
    public static void main(String[] args) {
        System.out.println(threeLevelGrouping());
    }

    public static LinkedHashMap<String, Set<Student>> threeLevelGrouping(){
        return StudentDatabase.getAllStudentDetails()
                .stream()
                .collect(
                        groupingBy(
                                Student::getName,
                                LinkedHashMap::new,
                                toSet()

                        )
                );

    }


}
