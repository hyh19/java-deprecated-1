package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 6.4 将字符串解析为日期
 */
public class DateParse {
    public static void main(String[] args) {
        // 解析日期字符串
        String armisticeDate = "1914-11-11";
        LocalDate aLD = LocalDate.parse(armisticeDate);
        System.out.println("Date: " + aLD);
        // 解析日期时间字符串
        String armisticeDateTime = "1914-11-11T11:11";
        LocalDateTime aLDT = LocalDateTime.parse(armisticeDateTime);
        System.out.println("Date/Time: " + aLDT);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMM uuuu");
        // LocalDate 是不带时区的，表示方式因操作系统而异。
        // String anotherDate = "27 Jan 2011"; // DateTimeParseException: Text '27 Jan 2011' could not be parsed at index 3
        String anotherDate = "27 五月 2011";
        LocalDate random = LocalDate.parse(anotherDate, df);
        System.out.println(anotherDate + " parses as " + random);
        // 格式化日期对象
        System.out.println(aLD + " formats as " + df.format(aLD));
    }
}
