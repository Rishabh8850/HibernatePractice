package main.Error;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

public class ZipExample {

    public static void main(String[] args) {
        //zipExample();
        //zipWithExample();
        zipIterbaleExample();
    }

    public static void zipExample() {
        Observable<Integer> oneToFive = Observable.just(1,2,3,4,5);
        Observable<Integer> sixToTen = Observable.range(6,5);
        Observable<Integer> elevenToFifteen = Observable.fromIterable(Arrays.asList(11,12,13,14,15));
        Observable.zip(oneToFive,sixToTen,elevenToFifteen,(a,b,c) ->a+b+c)
                .subscribe(System.out::println);
    }

    public static void zipWithExample() {
        Observable<Integer> oneToFive = Observable.just(1,2,3,4,5);
        Observable<Integer> sixToTen = Observable.range(6,5);
        oneToFive.zipWith(sixToTen, Integer::sum).subscribe(System.out::println);
    }

    public static void zipIterbaleExample() {
        Observable<Integer> oneToFive = Observable.just(1,2,3,4,5);
        Observable<Integer> sixToTen = Observable.range(6,5);
        Observable<Integer> elevenToFifteen = Observable.fromIterable(Arrays.asList(11,12,13,14,15));
        List<Observable<Integer>> obList = Arrays.asList(oneToFive, sixToTen, elevenToFifteen);
        Observable.zipIterable(obList,Arrays::toString,true,1).subscribe(System.out::println);
    }
}
