package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
//Expressão regulares
        /* \d => Todos os digitos
         * \D => Todos que não for digitos
         * \s => Todos os espaços em branco
         * \S => Todos os caracteres excluindo os brancos
         * \w => a-z A-Z, digitos
         * \W => Tudo que nao for incluso no \w
         * []*/


        String regex = "aba";
        String texto = "abaaba";
        String texto2 = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto: " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posicões encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
        System.out.println("***************");
//        regex = "\\d";
        regex = "0[xX][0-9a-fA-F]";
                texto = "12 0x 0X 0xFFABC 0x109 0x1";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);
        System.out.println("Texto: " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posicões encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
