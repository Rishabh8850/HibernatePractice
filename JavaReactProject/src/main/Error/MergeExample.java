package main.Error;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MergeExample {

    public static void main(String[] args) {
        //mergeExample();
        //mergeArrayExample();
        //mergeIterableExample();
        //mergeWithExample();
        mergeWithIntervalExample();
    }

    public static void mergeExample() {
        Observable<Integer> oneToFive = Observable.just(1,2,3,4,5);
        Observable<Integer> sixToTen = Observable.just(6,7,8,9,10);
        Observable.merge(oneToFive,sixToTen).subscribe(System.out::println);
    }

    public static void mergeArrayExample() {
        Observable<Integer> oneToFive = Observable.just(1,2,3,4,5);
        Observable<Integer> sixToTen = Observable.just(6,7,8,9,10);
        Observable<Integer> elevenToFifteen = Observable.just(11,12,13,14,15);
        Observable<Integer> sixteenToTwenty = Observable.just(16,17,18,19,20);
        Observable<Integer> ToneToTfive = Observable.just(21,22,23,24,25);
        Observable<Integer> TsixToThirty = Observable.just(25,26,27,28,29,30);
        Observable.mergeArray(oneToFive,sixToTen,elevenToFifteen,sixteenToTwenty,ToneToTfive,TsixToThirty).subscribe(System.out::println);
    }

    public static void mergeIterableExample() {
        Observable<Integer> oneToFive = Observable.just(1,2,3,4,5);
        Observable<Integer> sixToTen = Observable.just(6,7,8,9,10);
        Observable<Integer> elevenToFifteen = Observable.just(11,12,13,14,15);
        Observable<Integer> sixteenToTwenty = Observable.just(16,17,18,19,20);
        Observable<Integer> ToneToTfive = Observable.just(21,22,23,24,25);
        Observable<Integer> TsixToThirty = Observable.just(25,26,27,28,29,30);
        List<Observable<Integer>> intList = Arrays.asList(oneToFive,sixToTen,elevenToFifteen,sixteenToTwenty,ToneToTfive,TsixToThirty);
        Observable.merge(intList).subscribe(System.out::println);
    }

    public static void mergeWithExample() {
        Observable<Integer> oneToFive = Observable.just(1,2,3,4,5);
        Observable<Integer> sixToTen = Observable.just(6,7,8,9,10);
        oneToFive.mergeWith(sixToTen).subscribe(System.out::println);
    }

    public static void mergeWithIntervalExample() {
        Observable<String> ob1 = Observable.interval(1, TimeUnit.SECONDS).map(i -> "Interval 1 : "+i);
        Observable<String> ob2 = Observable.interval(2, TimeUnit.SECONDS).map(i -> "Interval 2 : "+i);
        ob1.mergeWith(ob2).subscribe(System.out::println);
        pause(6050);
    }

    private static void pause(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
