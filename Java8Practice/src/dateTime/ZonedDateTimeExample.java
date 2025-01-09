package dateTime;

import java.time.*;
import java.time.temporal.TemporalAdjuster;

public class ZonedDateTimeExample {

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime : "+zonedDateTime);
        System.out.println("Offset : "+ zonedDateTime.getOffset());
        System.out.println("Zone Id : "+ zonedDateTime.getZone());

        //ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);

        System.out.println("Chicago CST : "+ZonedDateTime.now(ZoneId.of("America/Chicago")));
        System.out.println("Detroit EST : "+ZonedDateTime.now(ZoneId.of("America/Detroit")));
        System.out.println("Los_Angeles PST : "+ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
        System.out.println("Denver MST : "+ZonedDateTime.now(ZoneId.of("America/Denver")));
        System.out.println("Clock of EST : "+ZonedDateTime.now(Clock.system(ZoneId.of("America/Detroit"))));

        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/Denver"));
        System.out.println("local Date Time MST with Zone :"+localDateTime);
        System.out.println("localDateTime EST using Clock : "+LocalDateTime.now(Clock.system(ZoneId.of("America/Detroit"))));

        LocalDateTime localDateTime1 =LocalDateTime.ofInstant(Instant.now(),ZoneId.of("America/Los_Angeles"));
        System.out.println("ofInstant PST : "+localDateTime1);

        //LocalDateTime , Instant to Zoned Date Time

        ZonedDateTime zonedDateTime1 =LocalDateTime.now().atZone(ZoneId.systemDefault());// atZone will attach time Zone whatever you have passed it will not convert time to that zone
        System.out.println("zonedDateTime1 : "+ zonedDateTime1);
        ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.systemDefault());//// atZone will attach time Zone whatever you have passed it will not convert time to that zone
        System.out.println("zonedDateTime2 : "+ zonedDateTime2);

        OffsetDateTime offsetDateTime = LocalDateTime.now().atOffset(ZoneOffset.ofHours(+5));//// atZone will attach time Zone whatever you have passed it will not convert time to that zone
        System.out.println("offsetDateTime : "+offsetDateTime);
    }
}
