package _08functioninterface._5unarybinaryoperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class _24BinaryOperatorExample {
    static Comparator<Integer> comparator = Integer::compareTo;
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a,b)-> a*b;
        System.out.println(binaryOperator.apply(3,4));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println(maxBy.apply(2,5));
        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println(minBy.apply(2,5));
    }
}
