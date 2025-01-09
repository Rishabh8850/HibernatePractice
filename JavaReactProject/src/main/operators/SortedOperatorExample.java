package main.operators;

import io.reactivex.Observable;

import java.util.Comparator;

public class SortedOperatorExample {

    public static void main(String[] args) {
        System.out.println("Natural Order Sorting");
        sortedExample();
        System.out.println();
        System.out.println("Reverse Order sorting");
        sortedReverseOrder();
        System.out.println();
        System.out.println("In Natural Order");
        sortedCustomOrder();
    }

    public static void sortedExample() {
        Observable.just(3,2,4,8,6)
                .sorted()
                .subscribe(System.out::println);
    }

    public static void sortedReverseOrder() {
        Observable.just(3,1,2,5,4)
                .sorted(Comparator.reverseOrder())
                .subscribe(System.out::println);
    }

    public static void sortedCustomOrder() {
        Observable.just("foo", "no","files","server")
                .sorted((x,y) -> Integer.compare(x.length(), y.length()))
                .subscribe(System.out::println);
    }
}
