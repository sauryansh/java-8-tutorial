package _15terminaloperations;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class TerminalOperationStreamPartitionByExample {
    static Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.8;

    public static void main(String[] args) {
        //System.out.println(partitionBy_1());
        System.out.println(partitionBy_2());
    }

    private static Map<Boolean, Set<Student>> partitionBy_2() {
        final Map<Boolean, Set<Student>> collect = StudentDatabase.getAllStudentDetails()
                .stream()
                .collect(
                        partitioningBy(gpaPredicate, toSet())
                );
        return  collect;
    }

    public static Map<Boolean, List<Student>> partitionBy_1(){
         final Map<Boolean, List<Student>> collect = StudentDatabase.getAllStudentDetails()
                .stream()
                .collect(partitioningBy(
                        gpaPredicate
                ));

        return collect;
    }
}
