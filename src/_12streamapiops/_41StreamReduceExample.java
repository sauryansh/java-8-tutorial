package _12streamapiops;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class _41StreamReduceExample {
    public static int performMultiplication(List<Integer> integerList) {
        return integerList.stream()
                //1
                //3
                //5
                //7
                //a=1,b=1(from stream)=> a result returned is 1
                //a=1,b=3(from stream)=> a result returned is 3
                //a=3,b=5(from stream)=> a result returned is 15
                //a=15,b=7(from stream)=> a result returned is 105
                .reduce(
                        1, (a, b) -> (a * b)
                );
    }

    public static Optional<Integer> performMultiplicationWithoutIdentify(List<Integer> integerList){
        return integerList.stream()
                .reduce((a,b)-> a*b);
    }

    public static Optional<Student> getHighestGPAStudent(){
        return StudentDatabase.getAllStudentDetails().stream()
                .reduce((s1, s2) -> (s1.getGpa() > s2.getGpa())?s1:s2);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 5, 7);
        int result = performMultiplication(integers);
        System.out.println(result);

        Optional<Integer> result1= performMultiplicationWithoutIdentify(integers);
        System.out.println(result1.isPresent() ? result1.get() : "result1 is null");
        final Optional<Student> highestGPAStudent = getHighestGPAStudent();
        System.out.println(highestGPAStudent.orElse(null));
    }
}
