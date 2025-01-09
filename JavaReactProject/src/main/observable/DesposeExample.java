package main.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.ResourceObserver;

import java.util.concurrent.TimeUnit;

public class DesposeExample {

    public static void main(String[] args) {
        handleDisposable();
        handleDisposeInObserver();
        handleDisposeOutObserver();
        compositeDisposible();
    }

    /**
     * Saves the returned disposable from the subscribe(),
     * and dispose it after 3000 milliseconds and pause the
     * thread for 3000 milliseconds more to check whether it emits or not
     */
    public static void handleDisposable() {
        Observable<Long> observable = Observable.interval(1, TimeUnit.SECONDS);
        Disposable disposable = observable.subscribe(item -> System.out.println("Dispose method : " + item));
        pause(2000);
        disposable.dispose();
    }

    /**
     * When we pass an Observer to the subscribe() method, it returns void.
     * So we need to get the Disposable from the overridden method onSubscribe,
     * so we can deal with it anywhere and any point in time
     */
    public static void handleDisposeInObserver() {
        Observable<Integer> observable = Observable.just(1,2,3,4,5);
        Observer<Integer> observer = new Observer<Integer>() {

            Disposable d;
            @Override
            public void onSubscribe(Disposable disposable) {
                d = disposable;
                System.out.println("Inside subscribe of handleDisposeInObserver");
            }

            @Override
            public void onNext(Integer integer) {
                if(integer == 3) {
                    d.dispose();
                }
                System.out.println("In On Next of handleDisposeInObserver : "+integer);

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {
                System.out.println("handleDisposeInObserver : Completed");
            }
        };
        observable.subscribe(observer);
    }

    /**
     * Used ResourceObserver here, to the disposable out of the subscribe
     * Instead of subscribe(), subscribeWith() has been used here
     * Which returns the Observer that we pass in
     * As ResourceObserver implements Disposable,
     * so we can deal with it like it is a Disposable
     */
    public static void handleDisposeOutObserver() {
        Observable observable = Observable.just(1,2,3,4,5);
        ResourceObserver<Integer> resourceObserver = new ResourceObserver<Integer>() {
            @Override
            public void onNext(Integer i) {
                System.out.println("Inside on Next handleDisposeOutObserver : "+i);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {

            }
        };
        observable.subscribeWith(resourceObserver);
    }

    public static void compositeDisposible() {
        Observable<Long> observable = Observable.interval(1, TimeUnit.SECONDS);
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        Disposable disposable1 = observable.subscribe(item -> System.out.println("Observer -1 : "+ item));
        Disposable disposable2 = observable.subscribe(item -> System.out.println("Observer -2 : "+ item));
        compositeDisposable.addAll(disposable1, disposable2);
        pause(3000);
        compositeDisposable.delete(disposable1);
        compositeDisposable.dispose();
        pause(3000);
    }

    public static void pause(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
