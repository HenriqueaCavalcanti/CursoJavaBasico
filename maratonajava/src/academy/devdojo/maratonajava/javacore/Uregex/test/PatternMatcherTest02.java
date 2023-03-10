package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
//Expressão regulares
        /* \d => Todos os digitos
         * \D => Todos que não for digitos
         * \s => Todos os espaços em branco
         * \S => Todos os caracteres excluindo os brancos
         * \w => a-z A-Z, digitos
         * \W => Tudo que nao for incluso no \w
         * []
         * ? zero ou uma
         * *zero ou mais
         * +uma ou mais
         * {n,m} de n até m
         * ()
         * | o(v|o)
         * $ fim da linha*/


        System.out.println("***************");

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto: " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posicões encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
