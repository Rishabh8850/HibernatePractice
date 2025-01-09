package main.operators;

import io.reactivex.Observable;

public class MapFilterExample {

    public static void main(String[] args) {
        mapExample();
        mapWithDifferentOutput();
        filterExample();
        mapWithFilter();
    }

    public static void mapExample() {
        Observable<Integer> observable = Observable.just(1,2,3,4,5);
        observable.map(item-> item*2)
                .subscribe(System.out::println);
    }

    public static void filterExample() {
        Observable<Integer> observable = Observable.just(1,2,3,4,5);
        observable.filter(item -> item%2==0).subscribe(System.out::println);
    }

    public static void mapWithDifferentOutput() {
        Observable<Integer> observable = Observable.just(1,2,3,4,5);
        observable.map(item -> "Hello World!").subscribe(System.out::println);
    }

    public static void mapWithFilter() {
        Observable<Integer> observable = Observable.just(1,2,3,4,5);
        observable.filter(i -> i%2!=0).map(item -> item*5).subscribe(System.out::println);
    }
}
