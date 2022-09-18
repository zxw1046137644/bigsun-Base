package Date;

import lombok.Generated;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日期时间API
 * jdk8之前
 * Date
 * SimpleDateFormat 对日期的格式化和解析
 * Calendar 日历类 获取当天在某些时候是第几天
 *
 *
 * jdk8时间API
 * LocalDate
 * LocalTime
 * LocalDateTime
 *
 * Instant 获取本初子午线中时间 跟本地时间有差距
 */
public class time {

    @Test
    public void getTime() {
        System.out.println(System.currentTimeMillis());
    }


    @Test
    public void simpDate() throws ParseException {
        SimpleDateFormat date = new SimpleDateFormat();
        SimpleDateFormat date3 = new SimpleDateFormat("YYYY-MM-dd");
        Date date1 = new Date();
        //获取日期
        System.out.println(date1);
        System.out.println(date1.getTime());

        //获取年月日
        System.out.println(date3.format(date1));
        String value = "2022-09-18";
        Date parse = date3.parse(value);
        System.out.println(parse);


        String format = date.format(date1);
        System.out.println(format);

        //解析时间
        System.out.println(date.parse(format));

        //转化成sql date
        java.sql.Date dateSql = new java.sql.Date(parse.getTime());
        System.out.println(dateSql);


    }

    @Test
    public void CalendarTest(){
        GregorianCalendar calendar = new GregorianCalendar();
        Date time = calendar.getTime();
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

    }

    @Test
    public void localTime(){
        LocalDate now = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime nowTime = LocalDateTime.now();
        System.out.println(now);
        System.out.println(time);
        System.out.println(nowTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String format = dateTimeFormatter.format(nowTime);
        System.out.println(format);

        String hh = "2022-09-18 11:03:56";
        TemporalAccessor parse = dateTimeFormatter.parse(hh);
        System.out.println(parse);


    }

    @Test
    public void instant(){
        Instant instant = Instant.now();
        System.out.println(instant);
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);

    }

}
