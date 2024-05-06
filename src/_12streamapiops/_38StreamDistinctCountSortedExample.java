
package _12streamapiops;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.List;

public class _38StreamDistinctCountSortedExample {
    public static List<String> printStudentActivities(){
        return StudentDatabase.getAllStudentDetails()
                .stream()
                .map(Student::getActivities)//this will return List<List<String>>
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();
    }

    public static Long getCountOfActivities(){
        return StudentDatabase.getAllStudentDetails()
                .stream()
                .map(Student::getActivities)//this will return List<List<String>>
                .flatMap(List::stream)
                .distinct()
                .count();
    }
    public static void main(String[] args) {
        System.out.println("Distinct List of activities: " + printStudentActivities());
        System.out.println("Count of activities: " + getCountOfActivities());

    }
}
