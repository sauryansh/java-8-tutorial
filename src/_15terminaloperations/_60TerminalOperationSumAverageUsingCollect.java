package _15terminaloperations;

import _00utility.Student;
import _00utility.StudentDatabase;

import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.summingInt;

 public class _60TerminalOperationSumAverageUsingCollect {
    public static void main(String[] args) {
        System.out.println("Total Number of notebooks: "+ sumOfNoteBooks());
        System.out.println("Average GPA: "+ averageOfGPA());
    }

    static int sumOfNoteBooks(){
        return StudentDatabase.getAllStudentDetails()
                .stream()
                .collect(summingInt(Student::getNotebooks));
    }
    static double averageOfGPA(){
        return StudentDatabase.getAllStudentDetails()
                .stream()
                .collect(averagingDouble(Student::getGpa));
    }


}
