package main.observable;

import io.reactivex.Observable;

public class CallableExample {

    //For Lazy Loading we are using fromCallable instead of just and interval
    public static void main(String[] args) {
        //Observable<Integer> observable = Observable.just(getValue()); //If we will not call subscribe then also it will invoke getValue Method and pring sout only
       // observable.subscribe(System.out::println, error -> System.out.println("An Exception occured : "+ error.getLocalizedMessage())); //This will not go to onError state before that it will throw Arithmatic exception
        //Instead of observable we must use callable
        Observable<Integer> observable = Observable.fromCallable(() -> {
            System.out.println("Inside callable : ");
            return getValue();
        });
        observable.subscribe(System.out::println, error -> System.out.println("An Exception occured : "+ error.getLocalizedMessage()));
    }

    public static int getValue() {
        System.out.println("Inside get value method");
        return 1/0;
    }
}
