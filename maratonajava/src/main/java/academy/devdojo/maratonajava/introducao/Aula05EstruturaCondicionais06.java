package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturaCondicionais06 {
    public static void main(String[] args) {
//      Utilizando Switch dados os valores de 1 a 7, imprima se é dia útil
//        ou final de semana.

        Scanner sc = new Scanner(System.in);

        System.out.print("A semana corresponde a 7 dias, temos o dia 1 correspondendo ao domingo\n" +
                "digite um numero e descubra se é dia útil ou final de semana: ");
        byte dia = sc.nextByte();

        switch (dia){
            case 1:
                System.out.println("Domingo, Final de semana.");
                break;
            case 2:
                System.out.println("Segunda, Dia útil.");
                break;
            case 3:
                System.out.println("Terça, Dia útil.");
                break;
            case 4:
                System.out.println("Quarta, Dia útil.");
                break;
            case 5:
                System.out.println("Quinta, Dia útil");
                break;
            case 6:
                System.out.println("Sexta, Dia útil");
                break;
            case 7:
                System.out.println("Sábado, Final de semana");
                break;
            default:
                System.out.println("Dia inválido, Digite de 1 à 7.");
                break;
        }
    }
}
