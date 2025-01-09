package main.operators;

import io.reactivex.Observable;

public class DefaultSwitchOperatorExample {

    public static void main(String[] args) {
        defaultIfEmptyExampleValid();
        System.out.println();
        defaultIfEmptyExample();
        System.out.println();
        switchIfEmptyValid();
        System.out.println();
        switchIfEmptyInValid();
    }

    public static void defaultIfEmptyExampleValid() {
        Observable.just(1,2,3,4,5,6)
                .filter(i -> i>=10)
                .defaultIfEmpty(100)
                .subscribe(item -> System.out.println("In defaultIfEmptyValid Method : "+item));
    }

    public static void defaultIfEmptyExample() {
        Observable.just(1,2,3,4,5,6,7)
                .filter(i -> i>=4)
                .defaultIfEmpty(100)
                .subscribe(i -> System.out.println("In defaultIfEmptyInvalid : "+i));
    }

    public static void switchIfEmptyValid() {
        Observable.just(1,2,3,4,5,6,7,8,9)
                .filter(i -> i>10)
                .switchIfEmpty(Observable.just(2,9,6))
                .subscribe(i -> System.out.println("In switchIfEmpty method : "+i));
    }

    public static void switchIfEmptyInValid() {
        Observable.just(1,2,3,4,5,6,7,8,9)
                .filter(i -> i>=9)
                .switchIfEmpty(Observable.just(2,9,6))
                .subscribe(i -> System.out.println("In switchIfEmpty method : "+i));
    }
}
