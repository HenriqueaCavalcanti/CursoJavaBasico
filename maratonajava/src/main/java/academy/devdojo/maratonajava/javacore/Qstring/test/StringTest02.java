package academy.devdojo.maratonajava.javacore.Qstring.test;

import java.util.Locale;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Luffy";
        String numeros = " 012345";
        System.out.println(nome.charAt(1));
        System.out.println(nome.length());
        System.out.println(nome.replace("f", "l"));
        System.out.println(nome.toLowerCase(Locale.ROOT));
        System.out.println(nome.toUpperCase(Locale.ROOT));

        System.out.println(numeros.length());
        System.out.println(numeros.substring(0, 2));
        System.out.println(numeros.substring(2));
        //remover espaço em branco.
        System.out.println(numeros.trim());
    }
}
