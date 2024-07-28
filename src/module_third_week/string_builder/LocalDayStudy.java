package module_third_week.string_builder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDayStudy {
    public static void main(String[] args) {
        String day = "02/28/2023";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.parse(day,dateTimeFormatter);
        System.out.println(localDate);


        LocalDate localDate1 = LocalDate.now();

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yy");

        String fortmatCurentDay = localDate1.format(dateTimeFormatter1);

        System.out.println(fortmatCurentDay);
    }
}
