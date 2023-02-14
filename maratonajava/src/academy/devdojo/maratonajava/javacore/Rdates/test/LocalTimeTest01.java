package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
         LocalTime time= LocalTime.of(23, 32,12);

        System.out.println(time);

         LocalTime agora = LocalTime.now();
        System.out.println(agora.getHour());
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIDNIGHT);

    }
}
