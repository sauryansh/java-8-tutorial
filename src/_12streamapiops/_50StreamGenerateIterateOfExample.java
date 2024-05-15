package _12streamapiops;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class _50StreamGenerateIterateOfExample {
    public static void main(String[] args) {
        System.out.println("------of Method-----------");

        final Stream<String> stringStream = Stream.of("Adam", "Dan", "Julie");
        stringStream.forEach(System.out::println);

        System.out.println("------Iterate Method-----------");
        Stream.iterate(1,x->x*2)
                .limit(10)
                .forEach(System.out::println)
        ;
        System.out.println("------generate Method-----------");

        Supplier<Integer> in = new Random()::nextInt;
        Stream.generate(in)
                .limit(5)
                .forEach(System.out::println);
    }
}
