package main.observable;

import io.reactivex.Observable;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ObservableCreationExample {

    public static void main(String[] args) {
        System.out.println("Observable using just method : ");
        createObservableUsingJust();
        System.out.println("Observable using from Iterable method : ");
        createObservableUsingFromIterable();
        System.out.println("Observable using create method : ");
        createObservableUsingCreate();
        System.out.println("Observable using create method when emmiter emits null : ");
        createObservableUsingCreateNull();
    }

    public static void createObservableUsingJust() {
        Observable<Integer> observable = Observable.just(1,2,3,4,5);
        observable.subscribe(System.out::println);
    }

    public static void createObservableUsingFromIterable() {
        List<Integer> intList = IntStream.rangeClosed(1,5).mapToObj(Integer::new).collect(toList());
        Observable<Integer> observable = Observable.fromIterable(intList);
        observable.subscribe(System.out::println);
    }

    public static void createObservableUsingCreate() {
        Observable<Integer> observable = Observable.create(emmiter -> {
            emmiter.onNext(1);
            emmiter.onNext(2);
            emmiter.onNext(3);
            emmiter.onNext(4);
            emmiter.onNext(5);
        });
        observable.subscribe(System.out::println, Throwable::getLocalizedMessage);
    }

    public static void createObservableUsingCreateNull() {
        Observable<Integer> observable = Observable.create(emmiter -> {
            emmiter.onNext(1);
            emmiter.onNext(2);
            emmiter.onNext(3);
            emmiter.onNext(4);
            emmiter.onNext(5);
            emmiter.onNext(null);
            emmiter.onComplete();
        });
        observable.subscribe(System.out::println, error -> System.out.println(error.getLocalizedMessage()), () -> System.out.print("Completed"));
    }
}
