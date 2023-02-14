package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest002 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;

        NumberFormat[] nfa = new  NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[1] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[3] = NumberFormat.getCurrencyInstance(localeJP);

        double valor = 1_000.2130;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "R$ 1.000,212";
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
