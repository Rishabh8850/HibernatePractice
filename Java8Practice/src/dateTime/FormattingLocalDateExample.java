package dateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {

    public static void main(String[] args) {

        //parse means string to LocalDate Conversion
        String dateString = "2024-12-25";
        LocalDate localDate = LocalDate.parse(dateString);
        System.out.println("Local Date : "+ localDate);

        LocalDate localDate1 = LocalDate.parse(dateString, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("localDate1 : "+ localDate1);

        String dateString2 = "20241210";
        LocalDate localDate2 = LocalDate.parse(dateString2, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("localDate2 : " +localDate2);

        String dateString3 = "2024|08|18";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate3 = LocalDate.parse(dateString3,dateTimeFormatter);
        System.out.println("localDate3 : "+ localDate3);

        //format means converting local Date to String
        String date1 = localDate.format(dateTimeFormatter);
        System.out.println("date1 : "+ date1);
    }
}
