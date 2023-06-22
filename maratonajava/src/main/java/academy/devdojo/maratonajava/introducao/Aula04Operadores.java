package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 20;
        int numero02 = 10;

        int soma = numero01 + numero02;
        int subtracao = numero01 - numero02;
        double divisao = numero01 / (double) numero02;
        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(divisao);

        int resto = 21 % 2;
        System.out.println(resto);

//        operadores lógicos  <  >  <=  >=  =!  ==
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("Dez é maior que 20? " + isDezMaiorQueVinte);

        Scanner sc = new Scanner(System.in);



//        = += -= *= /= %=

        int bonus = 1000;
        bonus += 2000;
        bonus -= 2000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);
    }
}
