package _12streamapiops;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.List;

public class _43StreamMapFilterReduce {
    private static int noOfNoteBook;
    public static void main(String[] args) {
        List<Student> students = StudentDatabase.getAllStudentDetails();

        final Integer reduceSum = students.stream()
                .filter(student -> student.getGradeLevel()>=3)
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNotebooks)//Stream of Integer
                //.reduce(0, (a,b)->a+b);
                 .reduce(0,Integer::sum);
        System.out.println(reduceSum);
    }


}
