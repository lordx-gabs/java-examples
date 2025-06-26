package dates;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest1 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        LocalDate date = LocalDate.of(2024, Month.JANUARY, 27); // só data
        LocalDate localDateNow = LocalDate.now(); // data atual
        localDateNow = localDateNow.plusWeeks(4); // não altera o objeto, retorna um novo
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));

        System.out.println(date);
        System.out.println(localDateNow);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
    }
}
