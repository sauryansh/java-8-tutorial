package _08functioninterface._4function;

import java.util.function.Function;

public class _20FunctionExample {

    static Function<String, String> function = String::toUpperCase;
    static Function<String, String> addSomeString = (name) -> name.concat("default");
    static Function<String, String> addSomeStringCompose = (name) -> name.concat(" SINGH");
    static Function<Integer,Integer> doubleFunction = num-> num*2;
    static Function<Integer,Integer> squareFunction = num-> num*num;
    // Using andThen() to combine two functions
    static Function<Integer, Integer> doubleThenSquare = doubleFunction.andThen(squareFunction);

    // Using compose() to combine two functions
    static Function<Integer, Integer> squareThenDouble = doubleFunction.compose(squareFunction);


    public static void main(String[] args) {
        System.out.println("Result is: "+function.apply("pritam"));
        System.out.println("Result is: "+function.andThen(addSomeString).apply("java8"));
        System.out.println("Result is: "+function.compose(addSomeString).apply("java8"));
        System.out.println("Result is: "+function.compose(addSomeStringCompose).apply("pritam"));

    /**
     * doubleFunction doubles the input number.
     * squareFunction squares the input number.
     * andThen() method combines the two functions in such a way that the output of the first function (doubleFunction) serves as the input to the second function (squareFunction).
     * compose() method combines the two functions in the reverse order, where the output of the first function (squareFunction) serves as the input to the second function (doubleFunction).
     * When running the code, you'll see the output of applying both combinations of functions to the input number.
     */

    // Test the combined functions
    int number = 5;
    System.out.println("Input: " + number);
    System.out.println("Double then Square: " + doubleThenSquare.apply(number)); // Output: (5 * 2) ^ 2 = 100
    System.out.println("Square then Double: " + squareThenDouble.apply(number)); // Output: (5 ^ 2) * 2 = 50


    }
}
