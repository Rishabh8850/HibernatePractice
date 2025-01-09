package optional;

import java.util.Optional;

public class StreamOptionaOrElseExample {

    public static void main(String[] args) throws Exception {
        System.out.println("nullableOrElse with Valid i/p : "+ nullableOrElse("Rishabh"));
        System.out.println("nullableOrElse with null i/p : " + nullableOrElse(null));
        System.out.println("nullableOrElseGet with Valid i/p : "+ nullableOrElseGet("Rishabh"));
        System.out.println("nullableOrElseGet with null i/p : " + nullableOrElseGet(null));
        System.out.println("nullableOrElseThrow with Valid i/p : "+ nullableOrElseThrow("Rishabh"));
        System.out.println("nullableOrElseThrow with null i/p : " + nullableOrElseThrow(null));
    }

    public static String nullableOrElse(String s) {
        return Optional.ofNullable(s).orElse("Not Present");
    }

    public static String nullableOrElseGet(String s) {
        return Optional.ofNullable(s).orElseGet(() -> "Not Present");
    }

    public static String nullableOrElseThrow(String s) throws Exception {
        return Optional.ofNullable(s).orElseThrow(() -> new Exception("Not Found"));
    }
}
