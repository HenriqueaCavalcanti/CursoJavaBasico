package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturaCondicionais04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário: ");
        double salario = entrada.nextDouble();
        double taxa = 0.0;
        if (salario >= 0 && salario <= 34712) {
            taxa = salario * 0.097;
            System.out.printf("Valor do seu salario é %.2f , com isso o imposto é de %.2f", salario, taxa);
        }
        else if (salario > 34712 && salario <= 68507) {
            taxa = salario * 0.3735;
            System.out.printf("Valor do seu salario é %.2f , com isso o imposto é de %.2f", salario, taxa);
        }
        else if (salario > 68507){
            taxa = salario * 0.495;
            System.out.printf("Valor do seu salario é %.2f , com isso o imposto é de %.2f", salario, taxa);
        }
        else {
            System.out.println("Salario inválido! Você digitou um valor negativo.");
        }


    }
}
