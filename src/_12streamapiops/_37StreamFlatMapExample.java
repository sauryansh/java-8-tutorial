package _12streamapiops;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class _37StreamFlatMapExample {
    public static List<String> printStudentActivities(){
        return StudentDatabase.getAllStudentDetails()
                .stream()
                .map(Student::getActivities)//this will return List<List<String>>
                .flatMap(List::stream)
                .toList();
    }
    public static void main(String[] args) {
        System.out.println(printStudentActivities()  );
    }
}
