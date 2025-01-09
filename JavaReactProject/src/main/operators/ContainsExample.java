package main.operators;

import io.reactivex.Observable;

public class ContainsExample {

    public static void main(String[] args) {
        containsExample();
        System.out.println();
        containExampleFalse();
        System.out.println();
        containsObjectExample();
    }

    public static void containsExample() {
        Observable.just(1,2,3,4,5,6)
                .contains(3)
                .subscribe(System.out::println);
    }

    public static void containExampleFalse() {
        Observable.just(1,2,3,4,5,6)
                .contains(10)
                .subscribe(System.out::println);
    }

    public static void containsObjectExample() {
        User user = new User();
        user.setName("Rishabh");
        Observable.just(user)
                .contains(user)
                .subscribe(System.out::println);
    }

    static class User {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
