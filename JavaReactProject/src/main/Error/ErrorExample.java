package main.Error;

import io.reactivex.Observable;

public class ErrorExample {

    public static void main(String[] args) {
        //doOnErrorExample();
        //onErrorResumeNextExample();
        //onErrorReturnExample();
        onErrorReturnItemExample();
    }

    //It will excuted when there will be any Error
    public static void doOnErrorExample() {
        Observable<Object> observable = Observable.error(new Exception("Do on error Example"));
        observable.doOnError(error -> System.out.println(error.getLocalizedMessage()))
                .subscribe(System.out::println, Throwable::printStackTrace,() -> System.out.print("Completed"));
    }

    //It will take Observable as input and if error occured then it will resume with the passed argument Observable
    public static void onErrorResumeNextExample() {
        Observable.error(new Exception())
                .onErrorResumeNext(Observable.just(1,2,3,4,5))
                .subscribe(System.out::println, Throwable::printStackTrace,() -> System.out.print("Completed"));
    }

    // It will take predicate as input
    public static void onErrorReturnExample() {
        Observable.error(new Exception()).onErrorReturn(error -> {
            if(error instanceof Exception) {
                return 0;
            }
            else {
                return 1;
            }
        }).subscribe(System.out::println, Throwable::printStackTrace,() -> System.out.print("Completed"));
    }

    public static void onErrorReturnItemExample() {
        Observable.error(new Exception())
                .onErrorReturnItem("Error Occured")
                .subscribe(System.out::println, Throwable::printStackTrace,() -> System.out.print("Completed"));
    }
}
