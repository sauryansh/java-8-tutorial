package _10lambdaandlocalvar;

import java.util.function.Consumer;

public class _30LambdaVariable {
    public static void main(String[] args) {
        int i =0;
        //Consumer<Integer> c1 = (i)-> System.out.println("Value of i :" +i);
        //we are not allowed to use the same variable that is already defined in the method scope.

        //we are not allowed to do this as well
        Consumer<Integer> c1 = (i1)-> {
            //int i =0; it is not allowed
            System.out.println("Value of i :" +i);
        };
    }
}
