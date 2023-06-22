package academy.devdojo.maratonajava.javacore.ZZZGpadroesdeprojeto.dominio;

import static academy.devdojo.maratonajava.javacore.ZZZGpadroesdeprojeto.dominio.Country.BRAZIL;
import static academy.devdojo.maratonajava.javacore.ZZZGpadroesdeprojeto.dominio.Country.USA;

public class CurrencyFactory {
    public static Currency newCurrency(Country country) {

        if(country.equals(USA)){
            return new Usdolar();
        }
        else if (country.equals(BRAZIL)){
            return new Real();
        } else {
             throw new IllegalArgumentException("No currency found for this country");
        }
//        switch (country) {
//            case USA:
//                return new Usdolar();
//            case BRAZIL:
//                return new Real();
//            default: throw new IllegalArgumentException("No currency found for this country");
//        }
    }
}
