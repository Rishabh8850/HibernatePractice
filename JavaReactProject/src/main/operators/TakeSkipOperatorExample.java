package main.operators;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class TakeSkipOperatorExample {

    public static void main(String[] args) {
        takeExample();
        takeWithIntervalExample();
        takeWhileExample();
        skipExample();
        skipWhileExample();
    }

    /**
     * take will work same as Limit in java 8
     */
    public static void takeExample() {
        Observable<Integer> observable = Observable.just(1,2,3,4,5);
        observable.take(2).subscribe(System.out::println);
    }

    /**
     * It has overriden take method which will take interval and timeUnit as I/P
     */
    public static void takeWithIntervalExample() {
        Observable<Long> observable = Observable.interval(200, TimeUnit.MILLISECONDS);
        observable.take(1,TimeUnit.SECONDS).subscribe(System.out::println);
        pause(3000);
    }

    /**
     * If we need to use anu condition to limit the emmission then we use takeWhile
     */
    public static void takeWhileExample() {
        Observable<Integer> observable = Observable.just(1,2,3,4,5,4,3,2,1);
        observable.takeWhile(i -> i<=3).subscribe(System.out::println);
    }

    public static void skipExample() {
        Observable<Integer> observable = Observable.just(1,2,3,4,5,4,3,2,1);
        observable.skip(3).subscribe(System.out::println);
    }

    public static void skipWhileExample() {
        Observable<Integer> observable = Observable.just(1,2,3,4,5,6);
        observable.skipWhile(i -> i%3==0).subscribe(System.out::println);
    }

    private static void pause(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
