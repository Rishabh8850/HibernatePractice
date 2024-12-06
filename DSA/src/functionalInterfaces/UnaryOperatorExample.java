package functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {
        //Unary Operator extends Function and it is applicable when return type and input type both same
        UnaryOperator<String> unaryOperator = s -> s.concat(" Shukla");
        System.out.println(unaryOperator.apply("Rishabh"));
    }
}
