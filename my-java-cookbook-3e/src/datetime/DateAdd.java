package datetime;

import java.time.LocalDate;
import java.time.Period;

/**
 * 6.6 日期或日历的加减
 */
public class DateAdd {
    public static void main(String[] av) {
        LocalDate now = LocalDate.now();
        // 700 天后的日期
        Period p = Period.ofDays(700);
        LocalDate then = now.plus(p);
        System.out.printf("Seven hundred days from %s is %s%n", now, then);
    }
}
