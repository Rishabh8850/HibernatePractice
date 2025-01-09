package dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalTimeExample {

    public static void main(String[] args) {

        String timeString = "14:00";
        LocalTime localTime = LocalTime.parse(timeString);
        System.out.println("localTime parsing : "+ localTime);

        LocalTime localTime1 = LocalTime.parse(timeString, DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println("localTime1 parser : "+ localTime1);

        String timeString1 = "13*00";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm");
        LocalTime localTime2 = LocalTime.parse(timeString1, dateTimeFormatter);
        System.out.println("localTime2 parser : "+localTime2);

        String timeString2 = "14|00|30";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("HH|mm|ss");
        LocalTime localTime3 = LocalTime.parse(timeString2, dateTimeFormatter1);
        System.out.println("localTime3 parser : "+localTime3);

        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ISO_LOCAL_TIME;
        String dateStringFormatted = LocalTime.now().format(dateTimeFormatter2);
        System.out.println("dateStringFormatted : "+dateStringFormatted);
    }
}
