package academy.devdojo.maratonajava.javacore.ZZZGpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZZGpadroesdeprojeto.dominio.Country;
import academy.devdojo.maratonajava.javacore.ZZZGpadroesdeprojeto.dominio.Currency;
import academy.devdojo.maratonajava.javacore.ZZZGpadroesdeprojeto.dominio.CurrencyFactory;

public class CountryTest {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.MEXICO);
        System.out.println(currency.getSymbol());


    }
}
