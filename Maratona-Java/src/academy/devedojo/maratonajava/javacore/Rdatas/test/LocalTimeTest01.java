package academy.devedojo.maratonajava.javacore.Rdatas.test;

import java.sql.SQLOutput;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 32, 12);
        LocalTime agora = LocalTime.now();
        System.out.println(agora);
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
    }
}
