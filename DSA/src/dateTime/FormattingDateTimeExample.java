package dateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingDateTimeExample {

    public static void main(String[] args) {
        String dateTimeString = "2024-12-08T18:00:00";
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeString);
        System.out.println("localDateTime parser : "+ localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.parse(dateTimeString, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("localDateTime1 parser : "+ localDateTime1);

        String dateTimeString1 = "20241207T03*05*11";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd'T'HH*mm*ss");
        LocalDateTime localDateTime2 = LocalDateTime.parse(dateTimeString1, dateTimeFormatter);
        System.out.println("localDateTime2 parser : "+localDateTime2);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDate = LocalDateTime.now().format(dateTimeFormatter1);
        System.out.println("formatDate : "+formatDate);
    }
}
