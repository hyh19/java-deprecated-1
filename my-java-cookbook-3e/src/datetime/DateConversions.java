package datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 6.3 日期/时间、YMDHMS 和 纪元秒（Epoch Seconds）之间的转换
 */
public class DateConversions {
    public static void main(String[] args) {
        // 转换纪元秒为系统时区的时间
        Instant epochSec = Instant.ofEpochSecond(1000000000L);
        // 获取系统的时区信息
        ZoneId zId = ZoneId.systemDefault();
        System.out.println(zId);
        ZonedDateTime then = ZonedDateTime.ofInstant(epochSec, zId);
        System.out.println("The epoch was a billion seconds old on " + then);

        // 转换系统时区的时间为纪元秒
        long epochSecond = ZonedDateTime.now().toInstant().getEpochSecond();
        System.out.println("Current epoch seconds = " + epochSecond);

        LocalDateTime now = LocalDateTime.now();
        // 获取某一个时区的当前时间
        ZonedDateTime there = now.atZone(ZoneId.of("Canada/Pacific"));
        System.out.printf("When it's %s here, it's %s in Vancouver%n",
                now, there);
    }
}
