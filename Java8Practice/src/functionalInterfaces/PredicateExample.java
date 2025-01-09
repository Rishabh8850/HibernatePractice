package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> evenPredicate = i -> i%2==0;
    static Predicate<Integer> condition1 = i -> i%5==0;

    public static void main(String[] args) {
        System.out.println(evenPredicate.or(condition1).negate().test(3));
    }
}
