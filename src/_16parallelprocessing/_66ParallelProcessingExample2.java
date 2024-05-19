package _16parallelprocessing;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _66ParallelProcessingExample2 {
    public static void main(String[] args) {
        System.out.println(sequentialStudentActivities());
        System.out.println(parallelStudentActivities());

    }

   public static List<String> sequentialStudentActivities(){
       long startTime = System.currentTimeMillis();

       List<String> studentActivities = StudentDatabase
               .getAllStudentDetails()
      /*         .stream()
               .parallel()*/
               .parallelStream()
               .map(Student::getActivities)
               .flatMap(List::stream)
               .distinct()
               .sorted()
               .collect(Collectors.toList());
       long endTime = System.currentTimeMillis();
       System.out.println("Duration of execution: Sequential : "+(endTime-startTime));
       return studentActivities;
   }
   public static List<String> parallelStudentActivities(){
       long startTime = System.currentTimeMillis();
       List<String> studentActivities = StudentDatabase
               .getAllStudentDetails()
               .stream()
               .parallel()
               .map(Student::getActivities)
               .flatMap(List::stream)
               .distinct()
               .sorted()
               .collect(Collectors.toList());
       long endTime = System.currentTimeMillis();
       System.out.println("Duration of execution: Parallel : "+(endTime-startTime));
       return studentActivities;
   }

}
