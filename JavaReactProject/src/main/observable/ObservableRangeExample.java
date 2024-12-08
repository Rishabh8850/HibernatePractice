package main.observable;

import io.reactivex.Observable;

public class ObservableRangeExample {

    public static void main(String[] args) {
        createObserverRange();

    }

    //It qill range number from start to start+count-1
    public static void createObserverRange() {
        Observable<Integer> observable = Observable.range(2,10);
        observable.subscribe(System.out::println);
    }
}
