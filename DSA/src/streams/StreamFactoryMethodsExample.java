package streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamFactoryMethodsExample {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Rishabh", " is", " learning", " java8", " features");
        stringStream.forEach(System.out::print);
        //Stream.iterate(1,num->num*2).forEach(System.out::println); //----> it will run infinitely so need to stop it
        System.out.println();
        Stream.iterate(1,num->num*2)
                .limit(10)
                .forEach(System.out::println);
        Supplier<Integer> supplier = new Random()::nextInt;
        /// limit(), findAny(), findFirst(), anyMatch(), allMatch(), noneMatch() all are short-circuiting  function in java 8        //Stream.generate(supplier).forEach(System.out::println);  //----> it will run infinitely so need to stop it
        Stream.generate(supplier)
                .limit(10)
                .forEach(System.out::println);
    }
}
