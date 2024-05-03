package _02impvsde;

import java.util.stream.IntStream;

public class _04ImperativeVsDeclarativeExample1 {
    public static void main(String[] args) {
        /**
         * Imperative Style: how style of programming
         */

        int   sum =0;
        for(int i=0;i<=100;i++){
            sum+=i;// shared mutable state and its sequential, and it will go step by step
            // and it will have issues if we try to run the code in multithreading environment
        }
        System.out.println("Total sum using Imperative Approach: "+sum);

        /**
         * Declarative style. (Functional programming uses the same style)
         * what style of programming.
         * You let the system do the job for you and get the result.
         */
        final int sum1 = IntStream.rangeClosed( 0, 100)
                //.parallel()
                .sum();
        System.out.println("Total sum using Declarative approach: " + sum1);

    }
}
