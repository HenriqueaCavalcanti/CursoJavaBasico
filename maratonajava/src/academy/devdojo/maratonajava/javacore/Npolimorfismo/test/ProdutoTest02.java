package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadorImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
//        Polimorfismo
        Produto computador = new Computador("Ryzen 9", 3000);
        CalculadorImposto.calcularImposto(computador);
        System.out.println("----------");
        Produto tomate = new Tomate("Siciliano", 10);
        CalculadorImposto.calcularImposto(tomate);
        System.out.println("--------");
        Televisao televisao = new Televisao("Sansung 50\" ",5000);
        CalculadorImposto.calcularImposto(televisao);
    }
}
