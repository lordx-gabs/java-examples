package dates;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        if(calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo primeiro dia da semana");
        }
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        calendar.add(Calendar.DAY_OF_MONTH, 2);
        calendar.add(Calendar.HOUR, 24);
        calendar.roll(Calendar.HOUR, 24);
        Date date = calendar.getTime();
        System.out.println(date);

    }
}
