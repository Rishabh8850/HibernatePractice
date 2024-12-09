package dateTime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimeDurationExample {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = localTime.plusHours(2);

        long duration = localTime.until(localTime1, ChronoUnit.MINUTES);
        System.out.println("duration in minutes : "+duration);

        Duration duration1 = Duration.between(localTime,localTime1);
        System.out.println("Diff between hours : "+duration1.toHours());

        Duration duration2 = Duration.ofHours(2);
        System.out.println("Diff of Minutes : "+duration2.toMinutes());
    }
}
