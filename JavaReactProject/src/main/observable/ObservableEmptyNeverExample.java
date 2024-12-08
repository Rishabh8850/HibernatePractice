package main.observable;

import io.reactivex.Observable;

public class ObservableEmptyNeverExample {
    public static void main(String[] args) {
        createObservableUsingEmpty();
        createObservableUsingNever();
    }

    //Empty Observable will completed without emmiting any thing
    public static void createObservableUsingEmpty() {
        Observable<Integer> observable = Observable.empty();
        observable.subscribe(System.out::println, System.out::println, () -> System.out.print("completed"));
    }


    //It will never emit the item nor completed
    public static void createObservableUsingNever() {
        Observable<Integer> observable = Observable.never();
        observable.subscribe(System.out::println, System.out::println, () -> System.out.print("completed"));
    }
}
