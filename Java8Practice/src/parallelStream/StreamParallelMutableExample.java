package parallelStream;

import java.util.stream.IntStream;

public class StreamParallelMutableExample {

    //With mutable object and fields parallel will not be consistent.
    //Don't use parallel with mutable objects
    public static void main(String[] args) {
        //System.out.println("Sequential Summation : " + sequentialSummation());
        parallelSummation();
        sequentialSummation();
    }

    public static void parallelSummation() {
        Sum sum = new Sum();
        IntStream.rangeClosed(1,1000).parallel().forEach(sum::getSum);
        System.out.println(sum.getTotal());
    }

    public static void sequentialSummation() {
        Sum sum = new Sum();
        IntStream.rangeClosed(1,1000).forEach(sum::getSum);
        System.out.println(sum.getTotal());
    }
}
