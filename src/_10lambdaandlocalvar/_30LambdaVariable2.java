package _10lambdaandlocalvar;

import java.util.function.Consumer;

public class _30LambdaVariable2 {
     static int value =4;
    public static void main(String[] args) {
        Consumer<Integer> c1 = (i)-> {
            value++;
            System.out.println("Value of i :" +(value+i));

        };
        //value=6;
        c1.accept(6);
    }
}
/**
 * instance variable there is not restriction but for local variable have restriction.
 */
