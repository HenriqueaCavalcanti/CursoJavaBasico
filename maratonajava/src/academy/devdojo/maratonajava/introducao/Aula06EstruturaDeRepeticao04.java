package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturaDeRepeticao04 {
    public static void main(String[] args) {
//        Dado o valor de um carro, descubra em quantas vezes
//        ele pode ser parcelado.
//        Condição valorParcela >= 1000
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor do carro: ");
        double valorDoCarro = sc.nextDouble();

        for (int parcela = 1; parcela < valorDoCarro; parcela++) {
            double valorParcela = valorDoCarro / parcela;
            if (valorParcela < 1000){
               break;
            }
            System.out.printf("Pode ser parcelado em %d de R$ %.2f \n", parcela, valorParcela);
        }
    }
}
