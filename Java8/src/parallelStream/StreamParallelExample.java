package parallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class StreamParallelExample {

    /* parallel stream works on the Fork/Join function
    It uses numOfThread = numberOf Processors available
     */
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("Time taken by sequential stream : "+ measurePerformance(StreamParallelExample::sumSequntialStream, 20));
        System.out.println("Time taken by parallel Stream : "+ measurePerformance(StreamParallelExample::sumParallelStream, 20));
    }

    public static int sumSequntialStream() {
        return IntStream
                .rangeClosed(1,100000)
                .sum();
    }

    public static int sumParallelStream() {
        return IntStream
                .rangeClosed(1,100000)
                .parallel()
                .sum();
    }

    public static long measurePerformance(Supplier<Integer> supplier, int numOfTimes) {
        long startTime = System.currentTimeMillis();
        for(int i =0; i<numOfTimes; i++) {
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }
}
