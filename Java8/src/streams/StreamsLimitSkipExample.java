package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6,7,8,9,10);
        Optional<Integer> result = addLimitedElement(integers);
        if(result.isPresent()) {
            System.out.println("Addition of first 2 element : " + result.get());
        }
        Optional<Integer> result1 = addSkippingElements(integers);
        if(result1.isPresent()) {
            System.out.println("Addition of skipped 2 element : " + result1.get());
        }
    }

    public static Optional<Integer> addLimitedElement(List<Integer> integers) {
        return integers.stream()
                .limit(2)
                .reduce(Integer::sum);
    }

    public static Optional<Integer> addSkippingElements(List<Integer> integers) {
        return integers.stream()
                .skip(2)
                .reduce(Integer::sum);
    }
}
