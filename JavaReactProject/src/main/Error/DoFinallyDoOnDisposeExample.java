package main.Error;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

public class DoFinallyDoOnDisposeExample {

    public static void main(String[] args) {
        doFinallyExample();
        doOnDisposeExampleValid();
    }

    //We can close resources in doFinally block, it will work similar as Finally block in try catch
    public static void doFinallyExample() {
        Observable.just(1,2,3,4,5)
                .doFinally(() -> System.out.println("doFinallyExample"))
                .subscribe(System.out::println);
    }

    //doOnDispose block will not be executed as RxJava calls Dispose method after subscription internally
    public static void doOnDisposeExample() {
        Disposable d = Observable.just(1,2,3,4,5)
                .doOnDispose(() -> System.out.println("doOnDisposeExample"))
                .subscribe(System.out::println);
        d.dispose();
    }

    public static void doOnDisposeExampleValid() {
        Observable.just(1,2,3,4,5)
                .doOnDispose(() -> System.out.println("doOnDisposeExampleValid"))
                .doOnSubscribe(disposable -> disposable.dispose())
                .subscribe(System.out::println);
    }
}
