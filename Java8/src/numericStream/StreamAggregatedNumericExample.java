package numericStream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamAggregatedNumericExample {

    public static void main(String[] args) {
        System.out.println("Sum is : " +IntStream.rangeClosed(1,50).sum());
        OptionalInt max = IntStream.rangeClosed(1,50).max();
        System.out.println("max value is : "+ (max.isPresent() ? max.getAsInt() : 0));
        OptionalLong  min = LongStream.rangeClosed(200,400).min();
        System.out.println("Min value is : "+ (min.isPresent() ? min.getAsLong() : 0));
        OptionalDouble avg = IntStream.rangeClosed(100,180).average();
        System.out.println("Avg value is : "+ (avg.isPresent() ? avg.getAsDouble() : 0));
    }
}
