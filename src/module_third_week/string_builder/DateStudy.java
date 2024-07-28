package module_third_week.string_builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateStudy {
    public static void main(String[] args) throws ParseException {
        String days = "02/28/2023";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = simpleDateFormat.parse(days);

        System.out.println(date);


        Date currentDate = new Date();
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
        String currentDate1 = simpleDateFormat1.format(currentDate);
        System.out.println(currentDate1);
    }
}
