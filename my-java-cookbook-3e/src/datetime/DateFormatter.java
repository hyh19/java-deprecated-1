package datetime;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 6.2 日期和时间的格式化
 */
public class DateFormatter {
    public static void main(String[] args) {

        // M/L 表示月
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/LL/dd");
        System.out.println(df.format(LocalDate.now()));

        // 解析日期字符串
        System.out.println(LocalDate.parse("2014/04/01", df));

        // 没有指定时区，默认使用系统设置。
        DateTimeFormatter nTZ =
                DateTimeFormatter.ofPattern("d MMMM, yyyy h:mm a");
        System.out.println(ZonedDateTime.now().format(nTZ));
    }
}