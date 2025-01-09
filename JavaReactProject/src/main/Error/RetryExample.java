package main.Error;

import io.reactivex.Observable;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class RetryExample {

    public static void main(String[] args) {
        //retryWithPredicateExample();
        //retryExample();
        retryUntillExample();
    }

    public static void retryWithPredicateExample() {
        Observable.error(new IOException()).retry(error -> {
            if (error instanceof IOException) {
                System.out.println("retrying");
                return true;
            } else return false;
        }).subscribe(System.out::println, Throwable::printStackTrace, () -> System.out.println("Completed"));
    }

    public static void retryExample() {
        Observable.error(new Exception())
                .doOnError(error -> System.out.println("In Error"))
                .retry(3).subscribe(System.out::println, Throwable::printStackTrace, () -> System.out.println("Completed"));
    }

    public static void retryUntillExample() {
        AtomicInteger i = new AtomicInteger();
        Observable.error(new Exception()).doOnError(error -> {
            System.out.println("Integer : "+ i.get());
            i.getAndIncrement();
        }).retryUntil(() -> {
            System.out.println("Retrying");
            return i.get()>=3;
        }).subscribe(System.out::println, Throwable::printStackTrace, () -> System.out.println("Completed"));
    }
}
