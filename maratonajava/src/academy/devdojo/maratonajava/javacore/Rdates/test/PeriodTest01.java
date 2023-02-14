package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);
         Period of = Period.of(10, 2, 5);
        Period p1 = Period.between(now, nowAfterTwoYears);
        System.out.println(p1);
        System.out.println(of);
    }
}
