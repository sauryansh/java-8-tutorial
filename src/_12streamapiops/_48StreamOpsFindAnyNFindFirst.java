package _12streamapiops;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.Optional;

public class _48StreamOpsFindAnyNFindFirst {
    public static Optional<Student> findAnyStudent(){
        return StudentDatabase.getAllStudentDetails()
                .stream()
                //it goes from top to bottom if any record found then, it returns the result.
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStudent(){
        return StudentDatabase.getAllStudentDetails()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .findFirst();
    }
    public static void main(String[] args) {
        Optional<Student> studentOptionalFindAny = findAnyStudent();
        if(studentOptionalFindAny.isPresent()){
            System.out.println("Found the student FindAny: "+studentOptionalFindAny.get());
        }else{
            System.out.println("No Student found");
        }

        Optional<Student> studentOptionalFindFirst = findFirstStudent();
        if(studentOptionalFindFirst.isPresent()){
            System.out.println("Found the student FindFirst: "+studentOptionalFindFirst.get());
        }else{
            System.out.println("No Student found");
        }
    }
    //Find an element in the stream
    //Both the functions return the result of type Optional.
    //findFirst() -> Returns the first element in the stream.
    //findAny() -> Returns the first encountered element in the stream.

}
