package functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);

    public static void main(String[] args) {
        BinaryOperator<Integer> mul = (a,b) -> a*b;
        System.out.println(mul.apply(3,4));
        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println(minBy.apply(5,4));
        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println(maxBy.apply(5,4));
    }
}
