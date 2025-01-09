package main.operators;

import io.reactivex.Observable;

public class RepeatScanOperatorExample {

    public static void main(String[] args) {
        repeatExample();
        System.out.println();
        scanExample();
    }

    public static void repeatExample() {
        Observable.just(1,2,3,4,5)
                .repeat(5)
                .subscribe(i -> System.out.println("In repeat Example : "+i));
    }

    public static void scanExample() {
        Observable.just(1,2,3,4,5,6,7,8)
                .scan((accumulator, item) -> accumulator+item)
                .subscribe(item -> System.out.println("In scan : "+item));
    }
}

