package module_2_oop.first_week_3.exercise3;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        String data1 = "13/09/2003";
        String date2 = "2004/08/23";

        LocalDate until1 = LocalDateUntil.fromString_ddMMyyyy(data1);
        LocalDate until2 = LocalDateUntil.fromString_yyyyMMdd(date2);

        System.out.println(until1);
        System.out.println(until2);

        LocalDate date = LocalDate.now();

        String day1 = LocalDateUntil.toString_ddMMyyyy(date);
        String day2 = LocalDateUntil.toString_yyyyMMdd(date);

        System.out.println(day1);
        System.out.println(day2);


    }

}
