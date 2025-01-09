package numericStream;

import java.util.stream.IntStream;

public class StreamNumericExample {

    public static void main(String[] args) {
        System.out.println(sumofNumberUsingStream());
    }

    public static int sumofNumberUsingStream() {
        return IntStream
                .rangeClosed(1,6)
                .reduce(1,(a,b)-> a+b);
    }
}
