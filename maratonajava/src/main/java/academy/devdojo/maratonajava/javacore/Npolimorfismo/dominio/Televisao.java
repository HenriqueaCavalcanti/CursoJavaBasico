package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto{

    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Televisao(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da Televisão");
        return this.getValor() * IMPOSTO_POR_CENTO;
    }
}
