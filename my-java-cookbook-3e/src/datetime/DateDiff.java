package datetime;

import java.time.LocalDate;
import java.time.Period;

/**
 * 6.5 两个日期之间的差
 */
public class DateDiff {
    public static void main(String[] args) {
        LocalDate endofCentury = LocalDate.of(2000, 12, 31);
        LocalDate now = LocalDate.now();
        System.out.println(now);
        Period diff = Period.between(endofCentury, now);
        System.out.printf("The 21st century (up to %s) is %s old%n", now, diff);
        System.out.printf(
                "The 21st century is %d years, %d months and %d days old",
                diff.getYears(), diff.getMonths(), diff.getDays());
    }
}
