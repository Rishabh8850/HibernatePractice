package main.observable;

import io.reactivex.Observable;

public class ObservableErrorExample {

    public static void main(String[] args) {
        throwExceptionUsingError();
        throwExceptionUsingCallable();
    }

    //If you are using error then it will createExceptio instance only once and rest of the subscribers using same Excpetion reference
    public static void throwExceptionUsingError() {
        Observable<Integer> observable = Observable.error(new Exception("An Error"));
        observable.subscribe(System.out::println, error -> System.out.println("Exception-1 : "+error.hashCode()));
        observable.subscribe(System.out::println, error -> System.out.println("Exception-2 : "+error.hashCode()));
    }

    public static void throwExceptionUsingCallable() {
        Observable<Integer> observable = Observable.error(() -> new Exception("An Error"));
        observable.subscribe(System.out::println, error -> System.out.println("Exception-1 : "+error.hashCode()));
        observable.subscribe(System.out::println, error -> System.out.println("Exception-2 : "+error.hashCode()));
    }
}
