package _14numericstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _54NumericStreamUnboxingExample {
    public static List<Integer> boxing(){
        //Primitive to Wrapper.
        return IntStream.rangeClosed(1,10)//intStream of 10 elements
                .boxed()//int
                .collect(Collectors.toList());//Integer
    }

    public static int unboxing(List<Integer> intList){
        return intList.stream()
                //Wrapper to primitive
                .mapToInt(Integer::intValue)
                .sum();
    }
    public static void main(String[] args) {
        List<Integer> result = boxing();
        System.out.println(result);
        System.out.println(unboxing(result));
    }
}
