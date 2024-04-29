package lambda.runnable;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        /**
         * prior to java 8
          */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
                // 0 -> O1==O2
                // 1 -> O1>O2
                // -1 -> O1<O2
            }
        };
        System.out.println("Result of comparator legacy: "+comparator.compare(3,5));

        Comparator<Integer> comparatorLambda = (Integer a1, Integer b1) -> {
            return a1.compareTo(b1);
        };

        System.out.println("Result of comparator :"+comparatorLambda.compare(3,2));
        Comparator<Integer> comparatorLambda1 = (a1,b1) -> {
            return a1.compareTo(b1);
        };

        System.out.println("Result of comparator :"+comparatorLambda1.compare(3,2));
    }



}
