package module_2_oop.first_week_3.exercise3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateUntil {
    public static DateTimeFormatter dateTimeFormatter_ddMMyyyy= DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static DateTimeFormatter dateTimeFormatter_yyyyMMdd= DateTimeFormatter.ofPattern("yyyy/MM/dd");

    public static LocalDate fromString_ddMMyyyy(String date){
        return LocalDate.parse(date,dateTimeFormatter_ddMMyyyy);
    }

    public static LocalDate fromString_yyyyMMdd(String date){
        return LocalDate.parse(date,dateTimeFormatter_yyyyMMdd);
    }

    public static String toString_ddMMyyyy(LocalDate date){
        return date.format(dateTimeFormatter_ddMMyyyy);
    }

    public static String toString_yyyyMMdd(LocalDate date){
        return date.format(dateTimeFormatter_yyyyMMdd);
    }
}
