package _14numericstream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class _53NumericStreamAggregateExample {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,50).sum();
        System.out.println("Sum :" + sum);

        OptionalInt optionalInt = IntStream.range(0,0).max();
        System.out.println(IntStream.range(0,0).count());

        System.out.println(optionalInt.isPresent()?optionalInt.getAsInt():0);
        final OptionalLong min = LongStream.rangeClosed(50, 100).min();
        System.out.println(min.isPresent()?min.getAsLong():0);

        final OptionalDouble average = IntStream.rangeClosed(1, 50).average();
        System.out.println(average.isPresent()?average.getAsDouble():0);
    }

}
