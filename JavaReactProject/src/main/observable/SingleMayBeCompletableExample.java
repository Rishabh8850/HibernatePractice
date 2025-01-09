package main.observable;

import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;

public class SingleMayBeCompletableExample {

    public static void main(String[] args) {
        singleExample();
        mayBeExample();
        completableExample();
    }

    public static void singleExample() {
        Single.just("Hello World").subscribe(System.out::println);
    }

    public static void mayBeExample() {
        Maybe.empty().subscribe(new MaybeObserver<Object>() {
            @Override
            public void onSubscribe(Disposable disposable) {
                System.out.println("MayBe subscribed :");
            }

            @Override
            public void onSuccess(Object o) {
                System.out.println("In Success");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("In Error");
            }

            @Override
            public void onComplete() {
                System.out.println("MayBe Completed ");
            }
        });
    }

    public static void completableExample() {
        Completable.fromSingle(Single.just("Hello World")).subscribe(() -> System.out.println("-Completable Completed"));
    }
}
