package main.operators;

import io.reactivex.Observable;

public class DistinctAndDistinctUntilChangeExample {

    public static void main(String[] args) {
        distictExample();
        distinctOverridenWithKeySelectorExample();
        distictUntilChangesExample();
        distinctUntilChangedOverridenWithKeySelectorExample();
    }

    public static void distictExample() {
        Observable.just(1,1,2,2,3,4,1,5,4)
                .distinct()
                .subscribe(item -> System.out.println("Emmiting distict value : "+item));
    }

    /**
     * Compare 2 Consecutive element for same
     */
    public static void distinctOverridenWithKeySelectorExample() {
        Observable.just("foo","fool","super","fire","file")
                .distinct(String::length)
                .subscribe(item -> System.out.println("Distinct with KeySelector : "+item));
    }

    public static void distictUntilChangesExample() {
        Observable.just(1,1,2,2,3,4,1,5,4)
                .distinctUntilChanged()
                .subscribe(item -> System.out.println("Emmiting distict value : "+item));
    }

    /**
     * It will check 2 consecutive element must not be of same length
     */
    public static void distinctUntilChangedOverridenWithKeySelectorExample() {
        Observable.just("foo","fool","super","fire","file")
                .distinctUntilChanged(String::length)
                .subscribe(item -> System.out.println("Distinct with KeySelector : "+item));
    }
}
