package dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Local Date : "+localDate);

        LocalDate localDate1 = LocalDate.of(2024, Month.DECEMBER,25);
        System.out.println("Local Date using of : "+localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(1993, 70);
        System.out.println("Local Date using ofYearDay : "+localDate2);

        /* Get values from localDate

         */
        System.out.println("getMonth : "+localDate.getMonth());
        System.out.println("getMonthValue : "+localDate.getMonthValue());
        System.out.println("getDayOfWeek : "+localDate.getDayOfWeek());
        System.out.println("getDayOfYear : "+ localDate.getDayOfYear());
        System.out.println("get Day of week using ChronoField : "+localDate.get(ChronoField.DAY_OF_WEEK));
        System.out.println("get Day of month using ChronoField : "+localDate.get(ChronoField.DAY_OF_MONTH));

        /*Modifying Local Date

         */
        System.out.println("plusDays : "+localDate.plusDays(2));
        System.out.println("plusMonths : "+localDate.plusMonths(2));
        System.out.println("minusDays : "+localDate.minusDays(2));
        System.out.println("withYear : "+localDate.withYear(2026));
        System.out.println("with Chrono Field : "+localDate.with(ChronoField.YEAR, 2028));
        System.out.println("with TemporalAdjusters : "+localDate.with(TemporalAdjusters.lastDayOfMonth()));

        //Additional Methods
        System.out.println("equal Check : "+localDate.isEqual(localDate1));
        System.out.println("is Before : "+localDate.isBefore(localDate1));
        System.out.println(("is After : "+localDate1.isAfter(localDate)));

        //Not Supported Method
        //System.out.println("Not Supported : "+ localDate.minus(1, ChronoUnit.MINUTES));
        System.out.println("isSupported Minute : "+localDate.isSupported(ChronoUnit.MINUTES));
        System.out.println("isSupported Days : "+localDate.isSupported(ChronoUnit.DAYS));
    }
}
