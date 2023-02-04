package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{

    public static final double IMPOSTO_POR_CENTO = 0.06;

    public Tomate(String name, double valor) {
        super(name, valor);
    }

        public double calcularImposto() {
            System.out.println("Calculando imposto do Tomate");
            return this.getValor() * IMPOSTO_POR_CENTO;
        }
    }

