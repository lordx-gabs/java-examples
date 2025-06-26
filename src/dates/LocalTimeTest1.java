package dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest1 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(14, 30, 45); // hora, minuto, segundo
        LocalTime now = LocalTime.now(); // hora atual
        // vai ate 23 horas
        System.out.println(time);
        System.out.println(now);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.get(ChronoField.HOUR_OF_DAY));

        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
