package optional;

import java.util.Optional;

public class StreamPresentExample {

    public static void main(String[] args) {
        Optional<String> s = Optional.ofNullable("rishabh");
        if(s.isPresent()) { // It only check if Optional having value or not
            System.out.println(s.get());
        }
        s.ifPresent(i -> System.out.println(i)); // It will check and process the result also
        s.ifPresentOrElse(i -> System.out.println(i),() -> System.out.print("Not Present"));

        Optional<String> s1 = Optional.ofNullable(null);
        if(s1.isPresent()) { // It only check if Optional having value or not
            System.out.println(s1.get());
        }
        s1.ifPresent(i -> System.out.println(i)); // It will check and process the result also
        s1.ifPresentOrElse(i -> System.out.println(i),() -> System.out.print("Not Present"));
    }
}
