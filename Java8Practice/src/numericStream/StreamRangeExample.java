package numericStream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamRangeExample {

    public static void main(String[] args) {
        System.out.println("Number of elements in range : "+ IntStream.range(1,50).count());
        System.out.println();
        System.out.println("Elements in range : ");
        IntStream.range(1,50).forEach(value -> System.out.print(value + " "));
        System.out.println();
        System.out.println("Number of elements in closed range : "+ IntStream.rangeClosed(1,50).count());
        System.out.println();
        System.out.println("Elements in closed range : ");
        LongStream.rangeClosed(1,50).forEach(value -> System.out.print(value + " "));
        System.out.println();
        System.out.println("Number of elements in Long range : "+ LongStream.range(1,50).count());
        System.out.println();
        System.out.println("Elements in Long range : ");
        LongStream.range(1,50).forEach(value -> System.out.print(value + " "));
        System.out.println();
        System.out.println("Number of elements in Long closed range : "+ LongStream.rangeClosed(1,50).count());
        System.out.println();
        System.out.println("Elements in Long closed range : ");
        LongStream.rangeClosed(1,50).forEach(value -> System.out.print(value + " "));
        System.out.println();
        System.out.println("Number of elements in Double closed range : "+ LongStream.rangeClosed(1,50).asDoubleStream().count());
        System.out.println();
        System.out.println("Elements in Double closed range : ");
        LongStream.rangeClosed(1,50).asDoubleStream().forEach(value -> System.out.print(value + " "));
    }
}
