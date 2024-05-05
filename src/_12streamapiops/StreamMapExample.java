package _12streamapiops;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamMapExample {
    public static void main(String[] args) {
        //Use-case: get all names from student database and store it into a list and print then.
        List<String> names = nameList();
        System.out.println("Names for students are: "+names);
    }

    public static List<String> nameList(){
        return StudentDatabase.getAllStudentDetails()
                .stream()
                .map(Student::getName)
                .collect(toList());
    }
}
