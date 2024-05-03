package _09methodreference;

import java.util.function.Function;

public class _26FunctionMethodReferenceExample {
    static Function<String, String> toUpperCaseLambda = (s)-> s.toUpperCase();
    static Function<String, String> toUpperCaseMethodReference = String::toUpperCase;
    public static void main(String[] args) {
        System.out.println("Lambda Expression: "+ toUpperCaseLambda.apply("pritam"));
        System.out.println("MethodReference Expression: "+ toUpperCaseMethodReference.apply("pritam"));
    }
}
