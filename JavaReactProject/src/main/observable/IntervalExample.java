package main.observable;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class IntervalExample {

    //It is an example of cold observable as it starts emitting from start
    public static void main(String[] args) {
        Observable<Long> observable = Observable.interval(1, TimeUnit.SECONDS);
        observable.subscribe(item -> System.out.println("Observer 1 : "+item));// It will not run untill we will stop main Thread
        pause(3000);
        observable.subscribe(item -> System.out.println("Observer 2 : "+item));
        pause(3000);
    }

    private static void pause(long duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
