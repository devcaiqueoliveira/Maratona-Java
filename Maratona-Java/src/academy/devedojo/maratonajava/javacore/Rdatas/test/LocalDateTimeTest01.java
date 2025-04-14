package academy.devedojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2022, Month.AUGUST, 11);
        LocalDate date2 = LocalDate.parse("2025-08-11");
        LocalTime time = LocalTime.of(9, 45, 21);
        LocalTime time2 = LocalTime.parse("09:45:21");
        System.out.println(date);
        System.out.println(date2);
        System.out.println(time);
        System.out.println(time2);
        System.out.println(localDateTime);
    }
}
