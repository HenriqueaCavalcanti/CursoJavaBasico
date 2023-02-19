package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
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
         * $ fim da linha
         * . 1.3 = 123, 133, 1@3, 1A3*/


        System.out.println("***************");

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("Email valido: ");
        System.out.println("#@!zoro@mail.br".matches(regex));
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
