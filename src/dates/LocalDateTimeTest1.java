package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest1 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2023-10-01");
        LocalTime time = LocalTime.parse("10:15:30");
        System.out.println(dateTime);
        System.out.println(dateTime.getMinute());
        System.out.println(dateTime.getDayOfMonth());

        System.out.println(date);
        System.out.println(time);
        LocalDateTime localDateTime2 = date.atTime(time);
        LocalDateTime localDateTime3 = time.atDate(date);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }
}
