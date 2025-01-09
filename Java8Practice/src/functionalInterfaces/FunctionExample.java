package functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> f1 = s -> s.toUpperCase();
    static Function<String, String> f2 = s -> s.toUpperCase().concat(" Shukla");

    public static void main(String[] args) {
        System.out.println(f1.apply("Rishabh"));
        System.out.println(f1.andThen(f2).apply("Rishabh")); //---> executes in order first f1 and then f2
        System.out.println(f1.compose(f2).apply("Rishabh")); // it will first execute argument of compose and then caller

    }
}
