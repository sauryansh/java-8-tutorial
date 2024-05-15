package _14numericstream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class _52NumericStreamRangesExample {
    public static void main(String[] args) {
        System.out.println("=================");
        IntStream intStream = IntStream.range(1,50);
        System.out.println("Range Count: "+intStream.count());
        System.out.println("RangeClosed Count: "+IntStream.rangeClosed(1,50).count());
        System.out.println("=================");
        IntStream.range(1,50).forEach(value -> System.out.print(value+","));
        System.out.println("\n=================");
        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value+","));
        IntStream.rangeClosed(1,50).asDoubleStream().forEach(value -> System.out.println("value: " +value));
        final OptionalInt max = IntStream.rangeClosed(1, 50).max();
        System.out.println(max.isPresent());
        System.out.println(max);
        OptionalInt max1 = IntStream.rangeClosed(0,0).max();
        System.out.println(max1.isPresent()?max1.getAsInt():0);
    }
}
