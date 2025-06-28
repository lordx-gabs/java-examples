package dates;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronosUnitTest1 {
    public static void main(String[] args) {
        LocalDateTime niver = LocalDateTime.of(2006, Month.APRIL,
                5, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(niver, now));
        System.out.println(ChronoUnit.WEEKS.between(niver, now));
        System.out.println(ChronoUnit.MONTHS.between(niver, now));
        System.out.println(ChronoUnit.YEARS.between(niver, now));
    }
}
