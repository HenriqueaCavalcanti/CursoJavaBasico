package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2022-08-06");
        LocalTime time = LocalTime.of(9, 48, 32);
        System.out.println(localDateTime);
        System.out.println(date);

        LocalDateTime ldt = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt);
        System.out.println(ldt2);
    }
}
