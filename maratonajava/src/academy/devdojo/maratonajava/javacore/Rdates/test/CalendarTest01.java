package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("O primeiro dia da semana é domingo");
        }

        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        c.add(Calendar.DAY_OF_MONTH, 2);
        c.roll(Calendar.HOUR_OF_DAY, 10);//NÃO DEIXA O DIA VIRAR.
        Date date = c.getTime();
        System.out.println(date);
    }
}
