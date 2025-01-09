package main.observable;

import io.reactivex.Observable;

public class ObservableRangeExample {

    static int start = 2, end = 10;
    public static void main(String[] args) {
        createObserverRange();
        System.out.println("Defer Example : ");
        createObserverDefer();
    }

    //It will range number from start to start+count-1
    public static void createObserverRange() {
        Observable<Integer> observable = Observable.range(start,end);
        observable.subscribe(System.out::println);
        end =15;
        observable.subscribe(System.out::println);// here end value is not going to  be updated it will be same as earlier i.e. end = 10
    }

    //If we want to use subscribe after updating the range then we should use defer, it will take Observable source as i/p
    public static void createObserverDefer() {
        Observable<Integer> observable = Observable.defer(() -> Observable.range(start,end));
        observable.subscribe(System.out::println);
        end = 15;
        observable.subscribe(System.out::println);
    }
}
