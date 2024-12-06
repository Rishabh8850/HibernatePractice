package functionalInterfaces;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String, String> functionMethodReference = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(functionMethodReference.apply("rishabh"));
    }
}
