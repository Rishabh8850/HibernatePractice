package parallelStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamParallelBoxedExample {

    //Do not parallel stream with boxing as it takes time to unbox it the perform Operation.
    public static void main(String[] args) {
        System.out.println(sequetialSum());
        System.out.println(parallelSum());
    }

    public static List<Integer> getIntList() {
        return IntStream.rangeClosed(1,1000)
                .boxed()
                .collect(Collectors.toList());
    }

    public static int parallelSum() {
        long startTime = System.currentTimeMillis();
        int sum = getIntList()
                .parallelStream()
                .reduce(0, (a,b) -> a+b); //------> take time for unboxing
        long endTime = System.currentTimeMillis();
        System.out.println("Duration for Parallel Execution : "+ (endTime-startTime));
        return sum;
    }

    public static int sequetialSum() {
        long startTime = System.currentTimeMillis();
        int sum = getIntList()
                .stream()
                .reduce(0, (a,b) -> a+b);
        long endTime = System.currentTimeMillis();
        System.out.println("Duration for parallel Execution : "+ (endTime-startTime));
        return sum;
    }
}
