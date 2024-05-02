package _08functioninterface._5unarybinaryoperator;

import java.util.function.UnaryOperator;

public class _23UnaryOperatorExample {
    static UnaryOperator<String> unaryOperator =(s)->s.concat("default");
    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("java-"));
    }
}
