package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate now1 = LocalDate.now();

        now = now.withDayOfMonth(20);
        now1 = now.with(ChronoField.DAY_OF_MONTH, 25);

        System.out.println(now1);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now1 = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));

        System.out.println(now1);

        now1 = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY));

        System.out.println(now1);


        now1 = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.TUESDAY));

        System.out.println(now1);

        now1 = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());

        System.out.println(now1.getDayOfWeek());





    }
}
