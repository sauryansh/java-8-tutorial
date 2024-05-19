package _16parallelprocessing;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _70ParallelStreamBoxedExample {
    public static int sequentialSum(List<Integer> intList){
        long startTime = System.currentTimeMillis();
        final Integer sum = intList.stream()
                .reduce(0, (x, y) -> x + y);
        long endTime = System.currentTimeMillis();
        System.out.println("Duration of execution: Sequential : "+(endTime-startTime));

        return sum;
    }
    public static int parallelSum(List<Integer> intList){
        long startTime = System.currentTimeMillis();
        final Integer sum = intList.stream()
                .parallel()
                .reduce(0, (x, y) -> x + y); //Effort needs it to unboxing from Integer to int
        long endTime = System.currentTimeMillis();
        System.out.println("Duration of execution: Parallel : "+(endTime-startTime));
        return sum;
    }
    public static void main(String[] args) {
        final List<Integer> intList = IntStream.rangeClosed(1, 1000000 )
                .boxed()
                .collect(Collectors.toList());

        System.out.println(sequentialSum(intList));
        System.out.println(parallelSum(intList));
    }
}
