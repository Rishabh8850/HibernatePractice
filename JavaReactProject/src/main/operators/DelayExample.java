package main.operators;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

import static main.observable.DesposeExample.pause;

public class DelayExample {

    /**
     * delay(n, TimeUntin.measure) delay n measure unit before emission
     * but interval delays each emmission by that much timeunit
     * @param args
     */
    public static void main(String[] args) {
        delayExample();
        delayErrorExample();
    }

    public static void delayExample() {
        Observable.just(1,2,3,4,5)
                .delay(3000, TimeUnit.MILLISECONDS)
                .subscribe(System.out::println);
        pause(5000);
    }

    public static void delayErrorExample() {
        Observable.just(new Exception("Error"))
                .delay(2000,TimeUnit.MILLISECONDS, true)
                .subscribe(System.out::println,
                        error -> System.out.println(error.getLocalizedMessage()),
                        () -> System.out.println("Completed"));
        pause(5000);
    }
}
