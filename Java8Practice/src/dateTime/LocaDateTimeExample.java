package dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocaDateTimeExample {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime : "+localDateTime);
        LocalDateTime localDateTime1 = LocalDateTime.of(2025,01,26,11,30,24,3456788);
        System.out.println("localDateTime1 : "+localDateTime1);

        /*getting value out od LocalDateTime

         */
        System.out.println("getHour : "+localDateTime.getHour());
        System.out.println("getMinute : "+localDateTime.getMinute());
        System.out.println("get Chrono Day : "+ localDateTime.get(ChronoField.DAY_OF_WEEK));

        /*modify LocalDateTime

         */
        System.out.println("plus hour : "+localDateTime.plusHours(2));
        System.out.println("With Month : "+localDateTime.with(ChronoField.MONTH_OF_YEAR,6));
        System.out.println("minusDays : "+localDateTime.minus(2, ChronoUnit.DAYS));

        /*
        Local Date and Local Time to LocalDateTime conversion and viceversa
         */

        LocalDate localDate = LocalDate.now();
        System.out.println("Local atTime : "+ localDate.atTime(23,59));

        LocalTime localTime = LocalTime.now();
        System.out.println("Local atDate : "+ localTime.atDate(LocalDate.now()));

        LocalDateTime localDateTime2 = localTime.atDate(LocalDate.now());
        System.out.println("toLocalDate : "+ localDateTime2.toLocalDate());
        System.out.println("toLocalTime : "+ localDateTime2.toLocalTime());


    }
}
