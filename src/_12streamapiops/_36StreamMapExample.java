package _12streamapiops;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class _36StreamMapExample {
    public static void main(String[] args) {
        //Use-case: get all names from student database and store it into a list and print then.
        List<String> names = nameList();
        System.out.println("Names for students are: "+names);
        System.out.println("Set of student: "+ nameSet());
    }

    public static List<String> nameList(){
        return StudentDatabase.getAllStudentDetails()
                .stream()
                .map(Student::getName)//Transformation
                .map(String::toUpperCase) //Operation is performed :
                .collect(toList());
    }

    public static Set<String> nameSet(){
        return StudentDatabase.getAllStudentDetails()
                .stream()
                .map(Student::getName)//Transformation
                .map(String::toUpperCase) //Operation is performed :
                .collect(Collectors.toSet());
    }
}
