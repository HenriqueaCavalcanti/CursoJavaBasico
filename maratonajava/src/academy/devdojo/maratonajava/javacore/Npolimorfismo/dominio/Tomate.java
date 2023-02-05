package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto {
    public String DataValidade;

    public static final double IMPOSTO_POR_CENTO = 0.06;

    public Tomate(String name, double valor, String dataValidade) {
        super(name, valor);
        this.DataValidade = dataValidade;
    }

    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate");
        return this.getValor() * IMPOSTO_POR_CENTO;
    }

    public String getDataValidade() {
        return DataValidade;
    }

    public void setDataValidade(String dataValidade) {
        DataValidade = dataValidade;
    }
}

