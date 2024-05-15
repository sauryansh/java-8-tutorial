package _14numericstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class _51NumericStreamExample {
    public static int sumOfNumber(List<Integer> intList){
        return intList
                .stream()
                .reduce(0,(x,y)-> x+y);
        // Problem: Integer is wrapper class and int is primitive type.
        // When unboxing to convert the Integer to int and perform the operation and return the result(Overhead)
    }

    public static int sumOfNumbersIntStream(){
        return IntStream.rangeClosed(1, 6).sum();
    }
    public static void main(String[] args) {
        List<Integer> inList = Arrays.asList(1,2,3,4,5,6);
        System.out.println("Sum of Numbers: " + sumOfNumber(inList));
        System.out.println("Sum of Numbers RangeClosed: " + sumOfNumbersIntStream());
    }

}
