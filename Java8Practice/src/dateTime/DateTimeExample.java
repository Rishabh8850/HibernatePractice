package dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Local Date : "+localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println("Local Time : "+localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local Date Time : "+localDateTime);
    }
}
