package dateTime;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("Instant time : "+instant);
        System.out.println("Instant start date : " +Instant.ofEpochMilli(0));
        System.out.println("Instant getEpochSecond : "+ instant.getEpochSecond());

        Duration duration = Duration.between(instant,Instant.now());
        System.out.println("get nano : "+duration.getNano());
    }
}
