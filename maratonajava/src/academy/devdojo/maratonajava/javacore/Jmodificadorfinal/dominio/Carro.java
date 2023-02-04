package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public final class Carro {
    private String name;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
