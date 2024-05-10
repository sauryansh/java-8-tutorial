package _12streamapiops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class _44StreamMaxReduce {
    public static int findMaxValue(List<Integer> integers){
        return integers.stream()
                //.reduce(Integer.MIN_VALUE, (x,y)->Math.max(x,y));
                //6->y
                //7->y
                //8->y
                //9->y
                //10->y
                //x hold the max value for each element in the iteration.
                .reduce(Integer.MIN_VALUE, Math::max);
    }

    public static int findMinValue(List<Integer> integers){
        return integers.stream()
               .reduce(Integer.MAX_VALUE, (A,B)->A<B?A:B);
    }
    public static Optional<Integer> findMinValueOptional(List<Integer> in){
        return in.stream()
                .reduce((A,B)->A<B?A:B);
    }
    public static Optional<Integer> findMaxValueOptional(List<Integer> integers){
        return  integers.stream()
                //.reduce(Integer.MIN_VALUE, (x,y)->Math.max(x,y));
                //6->y
                //7->y
                //8->y
                //9->y
                //10->y
                //x hold the max value for each element in the iteration.
                .reduce(Math::max);
    }
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6,7,80,9,10);
        List<Integer> integers1 = new ArrayList<>();
        System.out.println("Max Value: "+findMaxValue(integers));
        System.out.println("Min Value: "+findMinValue(integers));

        final Optional<Integer> maxValueOptional = findMaxValueOptional(integers1);
        System.out.print("Max Value optional: ");
        System.out.println(maxValueOptional.isPresent()
                ?maxValueOptional.get()
                :"No Max value found");
        System.out.print("Min Value optional: ");
        final Optional<Integer> minOptionalValue = findMinValueOptional(integers1);
        System.out.println(minOptionalValue.isPresent()
                ?minOptionalValue.get()
                :"No Min value found");
    }
}
