package numericStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxingExample {

    public static void main(String[] args) {
        System.out.println(boxing());
        List<Integer> numList = boxing();
        System.out.println("Sum is : " + unboxing(numList));

    }

    public static List<Integer> boxing() {
        return IntStream
                .rangeClosed(1,20)
                .boxed()
                .collect(Collectors.toList());
    }

    public static int unboxing(List<Integer> numList) {
        return numList.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
