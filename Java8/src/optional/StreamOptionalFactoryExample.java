package optional;

import java.util.Optional;

public class StreamOptionalFactoryExample {

    /*Optional.OfNullable --> is used when we are expecting result might be null
                              if non null value then will get Optional[value]
                              if we will get value as null then will get Option.empty
      Optional.of     -->   is used when we are not expecting value as null
                            if non null value then will get Optional[value]
                            if we will get value as null then will get nullPointerException
      Optional.empty   --> is used to when we used Optional.of and we will get null result or in Catch block we can set it.
     */
    public static void main(String[] args) {

        System.out.println("Optional OfNullable Valid : "+ optionalOfNullableValid());
        System.out.println("Optional OfNullable Null : "+ optionalOfNullableNull());
        System.out.println("Optional Of Valid : "+ optionalOfValid());
        //System.out.println("Optional Of Null : "+ optionalOfNull());
        System.out.println("Optional empty : "+ optionalEmpty());
    }

    public static Optional<String> optionalOfNullableValid() {
        Optional<String> op = Optional.ofNullable("Rishabh");
        return op;
    }

    public static Optional<String> optionalOfNullableNull() {
        Optional<String> op = Optional.ofNullable(null);
        return op;
    }

    public static Optional<String> optionalOfValid() {
        Optional<String> op = Optional.of("Rishabh");
        return op;
    }

    public static Optional<String> optionalOfNull() {
        Optional<String> op = Optional.of(null);
        return op;
    }

    public static Optional<String> optionalEmpty() {
        Optional<String> op = Optional.empty();
        return op;
    }
}
