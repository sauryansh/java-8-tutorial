package _14numericstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class _55NumericStreamMapExample {
    public static List<Integer> mapToObj(){
        return IntStream.rangeClosed(1,6)
                //.mapToObj(Integer::new)
                //.mapToObj((i)->{return new Integer(i);})
                //.mapToObj(Integer::valueOf)
                .boxed()
                .collect(Collectors.toList());
    }
    public static long mapToLong(){
        return IntStream.rangeClosed(1,5)//IntStream
                .mapToLong((i)->i)//convert IntStream to LongStream
                .sum();
    }
    public static double mapToDouble(){
        return IntStream.rangeClosed(1,5)//IntStream
                .mapToDouble((i)->i)//convert IntStream to LongStream
                .sum();
    }
    public static void main(String[] args) {
        System.out.println(mapToObj());
        System.out.println(mapToLong());
        System.out.println(mapToDouble());

        List<Double> celsiusTemperatures = Arrays.asList(25.0, 30.5, 15.3, 20.7, 10.8);

        // Using mapToDouble to convert Celsius temperatures to Fahrenheit
        DoubleStream fahrenheitTemperatures = celsiusTemperatures.stream()
                .mapToDouble(celsius -> celsius * 9 / 5 + 32);

        // Printing elements of DoubleStream
        fahrenheitTemperatures.forEach(System.out::println);
    }
}
