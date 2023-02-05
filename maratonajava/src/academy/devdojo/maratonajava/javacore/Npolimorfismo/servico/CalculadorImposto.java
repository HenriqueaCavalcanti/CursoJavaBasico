package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadorImposto {
    public static void calcularImposto(Produto produto) {
//        System.out.println("Relatorio de imposto do computador");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getName());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
//       O instanceof faz a verificação entre o objeto e a instancia.
        if (produto instanceof Tomate){
           Tomate tomate = (Tomate) produto;
           System.out.println(tomate.getDataValidade());
       }
    }

//    public static void calcularImpostoTomate(Tomate tomate){
//        System.out.println("Relatorio de imposto do computador");
//        double imposto = tomate.calcularImposto();
//        System.out.println("Computador: " + tomate.getName());
//        System.out.println("Valor: " + tomate.getValor());
//        System.out.println("Imposto a ser pago: " + imposto);
//    }
}
