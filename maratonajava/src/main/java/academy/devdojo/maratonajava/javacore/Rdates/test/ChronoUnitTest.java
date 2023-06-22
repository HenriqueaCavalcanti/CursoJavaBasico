package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1997, Month.JULY, 4, 7, 12, 0);
        System.out.println("Dias: " + ChronoUnit.DAYS.between(aniversario,LocalDateTime.now()));
        System.out.println("Meses: " +ChronoUnit.MONTHS.between(aniversario,LocalDateTime.now()));
        System.out.println("Semanas: " +ChronoUnit.WEEKS.between(aniversario,LocalDateTime.now()));
        System.out.println("Anos: " +ChronoUnit.YEARS.between(aniversario,LocalDateTime.now()));

    }
}
