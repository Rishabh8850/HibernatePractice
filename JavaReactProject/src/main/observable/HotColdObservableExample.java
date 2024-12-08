package main.observable;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

public class HotColdObservableExample {

    public static void main(String[] args) throws InterruptedException {
        createColdObservable();
        createConnectAndHotObservableWithoutConnect();
        createConnectAndHotObservable();
        createConnectAndHotObservableWith2Subscribers();
    }

    public static void createColdObservable() throws InterruptedException {
        Observable<Integer> coldObservable = Observable.just(1,2,3,4,5);
        coldObservable.subscribe(s -> System.out.println("Observer-1 : "+s));
        Thread.sleep(3000);
        coldObservable.subscribe(s-> System.out.println("Observer-2 : "+s));
    }

    // It will not emit until we will call connect
    // It misses all those items which has been called after connect
    public static void createConnectAndHotObservableWithoutConnect() {
        ConnectableObservable<Integer> hotObservable = Observable.just(1,2,3,4,5).publish();
        hotObservable.subscribe(s -> System.out.println("Hot-Observable-1 : "+s));
    }

    public static void createConnectAndHotObservable() {
        ConnectableObservable<Integer> hotObservable = Observable.just(1,2,3,4,5).publish();
        hotObservable.subscribe(s -> System.out.println("Hot-Observable-1 : "+s));
        hotObservable.connect();
    }

    public static void createConnectAndHotObservableWith2Subscribers() throws InterruptedException {
        ConnectableObservable<Integer> hotObservable = Observable.just(1,2,3,4,5).publish();
        hotObservable.subscribe(s -> System.out.println("Hot-Observable-2 : "+s));
        Thread.sleep(1000);
        hotObservable.connect();
    }
}
