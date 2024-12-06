package com.rish.rxJava;

import io.reactivex.rxjava3.core.Observable;

public class PracticeRxJava {
    static String result;
    public static void main(String[] args) {
        String[] str = {"Rishabh", "is", "learning", "RxJava"};
        Observable<String> ob = Observable.just("Rishabh");
        ob.subscribe(s -> System.out.println(s));
        Observable<String> ob1 = Observable.fromArray(str);
        ob1.subscribe(s -> result = (result !=null?result+" "+s:s), //onNext
                Throwable::printStackTrace, //onError
                () -> System.out.print(result)// onComplete
                 );
    }
}
