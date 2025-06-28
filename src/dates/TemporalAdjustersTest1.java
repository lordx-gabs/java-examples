package dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.withMonth(Month.APRIL.getValue());
        now = now.with(ChronoField.DAY_OF_MONTH, 20);
        System.out.println(now);

        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        System.out.println(now);

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(now);

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        System.out.println(now);

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now);

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(now);
    }
}
