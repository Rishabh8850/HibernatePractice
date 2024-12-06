package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxMinReduceExample {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,5,2,10,7);
        List<Integer> num2 = new ArrayList<>();
        System.out.println("Max for non empty List : ");
        System.out.println(maxNum(num));
        System.out.println("Max for empty List");
        System.out.println(maxNum(num2));// wrong o/p o
        System.out.println("Max for non empty List using optional : ");
        maxNumOptional(num);
        maxNumOptional(num2);
        System.out.println();
        System.out.println();
        System.out.println("Min Value Example");
        System.out.println("Min for non empty List : ");
        System.out.println(minNum(num));//wrong O/P
        System.out.println("Min for empty List");
        System.out.println(minNum(num2));// wrong o/p o
        System.out.println("Min for non empty List using optional : ");
        minNumOptional(num);
        minNumOptional(num2);
    }

    private static void maxNumOptional(List<Integer> num2) {
        Optional<Integer> opMax = num2.stream().reduce((a, b) -> a>b?a:b);
        if(opMax.isPresent()) {
            System.out.println("Min value is : "+ opMax.get());
        } else {
            System.out.println("Min value is not present.");
        }
    }

    private static int maxNum(List<Integer> num) {
        return num.stream()
                .reduce(0, (a,b) -> a>b?a:b);
    }

    private static void minNumOptional(List<Integer> num2) {
        Optional<Integer> opMax = num2.stream().reduce((a, b) -> a<b?a:b);
        if(opMax.isPresent()) {
            System.out.println("Max value is : "+ opMax.get());
        } else {
            System.out.println("Max value is not present.");
        }
    }

    private static int minNum(List<Integer> num) {
        return num.stream()
                .reduce(0, (a,b) -> a<b?a:b);
    }
}
