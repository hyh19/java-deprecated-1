package datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 * 6.7 与传统日期和日历类的接口
 */
public class LegacyDates {
    public static void main(String[] args) {
        // 旧的 Date 类
        Date legacyDate = new Date();
        System.out.println(legacyDate);
        // 转换为新的 LocalDateTime
        LocalDateTime newDate = LocalDateTime.ofInstant(legacyDate.toInstant(), ZoneId.systemDefault());
        System.out.println(newDate);
        // 旧的 Calendar 类
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        // 转换为新的 LocalDateTime
        LocalDateTime newCal = LocalDateTime.ofInstant(c.toInstant(), ZoneId.systemDefault());
        System.out.println(newCal);
    }
}
