package dateTime;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample {

    /*
    Period is only compatible with LocalDate.
     */
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2024,01,01);
        LocalDate localDate1 = LocalDate.of(2024,12,31);

        Period period = localDate.until(localDate1); //converting Date to Period
        System.out.println("Days :"+period.getDays());// it will do difference between Dates 31-1
        System.out.println("Months : "+period.getMonths());// it will do difference between months only 12-1
        System.out.println("Years : "+period.getYears());//it will do difference between years only 2024-2024

        Period period1 = Period.ofDays(10);
        System.out.println("getDays : "+ period1.getDays());

        Period period2 = Period.ofYears(11);
        System.out.println("getDays out of years : "+period2.getDays());
        System.out.println("getMonths out of years : "+period2.getMonths());
        System.out.println("getYears out of years : "+period2.getYears());

        Period period3 = Period.between(localDate,localDate1);
        System.out.println("Period : "+period3.getYears() + " "+period3.getMonths()+" "+ period3.getDays());
    }
}
