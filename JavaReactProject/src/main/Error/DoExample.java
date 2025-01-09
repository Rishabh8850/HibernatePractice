package main.Error;

import io.reactivex.Observable;

public class DoExample {

    public static void main(String[] args) {
        doOnSubscribeExample();
        doOnNextExample();
        doOnCompletionExample();
    }

    public static void doOnSubscribeExample() {
        Observable.just(1,2,3,4,5)
                .doOnSubscribe(i -> System.out.println("doOnSubscribeExample : doOnSubscribe"))
                .subscribe(System.out::println);
    }

    public static void doOnNextExample() {
        Observable.just(1,2,3,4,5)
                .doOnNext(item -> System.out.println("On Next : "+item))
                .subscribe(System.out::println);
    }

    public static void doOnCompletionExample() {
        Observable.just(1,2,3,4,5)
                .doOnComplete(() -> System.out.println("doOnCompletionExample : doOnCompletionExample"))
                .subscribe(System.out::println);
    }
}

