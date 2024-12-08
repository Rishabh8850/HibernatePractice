package main.observable;

import io.reactivex.Observable;

public class ObservableBasicExample {

    public static void main(String[] args) {
        Observable<String> observable = Observable.just("Rishabh", " is", " learning", " RxJava", " from", " scratch.");
        observable.subscribe(s -> System.out.print(s), Throwable::printStackTrace, () -> System.out.println("-completed")
        );
    }
}
