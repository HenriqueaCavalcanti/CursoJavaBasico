package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DurationTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinutos7Hours = LocalTime.now().minusHours(7);
        Period p1 = Period.ofWeeks(58);

        Duration between = Duration.between(now, nowAfterTwoYears);
        Duration between2 = Duration.between(timeNow, timeMinutos7Hours);
        Duration between3 = Duration.between(Instant.now(), Instant.now().plusSeconds(60));
        System.out.println(between);
        System.out.println(between3);

        System.out.println(now.until(now.plusDays(p1.getDays()), ChronoUnit.MONTHS));

    }
}
