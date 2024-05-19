package _16parallelprocessing;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class _66ParallelProcessingExample1 {
    public static void main(String[] args) {
        final int availableProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println(availableProcessors);
        System.out.println("SQ: "+checkPerformanceResult(_66ParallelProcessingExample1::sumSequentialStream,20));
        System.out.println("PP: "+checkPerformanceResult(_66ParallelProcessingExample1::sumParallelStream,20));
    }
    public static long checkPerformanceResult(Supplier<Integer> supplier,int numberOfTimes){
        long startTime = System.currentTimeMillis();
        for(int i=0;i<numberOfTimes;i++){
            System.out.println("Sum: "+supplier.get()+ " on Event Iteration: "+ i );
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }

    public static int sumSequentialStream(){
        return IntStream.rangeClosed(1,100000000)
                .sum();
    }
    public static int sumParallelStream(){
        return IntStream.rangeClosed(1,100000000)
                .parallel()
                .sum();
    }


}
