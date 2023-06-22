package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(double num1, double num2) {
        System.out.println(num1 + num2);
    }

    public double divisaoEntreDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void divisao(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return;
        }
        System.out.println("Divisão por zero não permitida");
    }


    public void somaArray(int[] numeros){
        int soma = 0;
        for (int temp = 0; temp < numeros.length ; temp++) {
            soma += + numeros[temp];
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int temp = 0; temp < numeros.length ; temp++) {
            soma += + numeros[temp];
        }
        System.out.println(soma);
    }
}
