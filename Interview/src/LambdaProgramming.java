import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class LambdaProgramming {
    public static void main(String[] args) {
        System.out.println(sumofNaturalNumbers(100));
        List<Integer> ll = Arrays.asList(1,2,3,5,2,4,3,3,4,4,5,6,6,6,8);
        System.out.println(findingUniqueFromList(ll));
        new Thread(() -> System.out.println("In Thread 1")).start();
        System.out.println(comparatorExample(3,2));
    }

    private static int comparatorExample(Integer a, Integer b) {
        Comparator<Integer> comparator = (i,i1) -> i.compareTo(i1);
        return comparator.compare(a,b);
    }

    private static Object findingUniqueFromList(List<Integer> arr) {
        return arr.stream().distinct().collect(toList());
    }

    private static int sumofNaturalNumbers(int i) {
        return IntStream.rangeClosed(0,i).sum();
    }
}
