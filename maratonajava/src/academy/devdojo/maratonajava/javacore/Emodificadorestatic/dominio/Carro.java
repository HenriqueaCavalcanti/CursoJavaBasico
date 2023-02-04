package academy.devdojo.maratonajava.javacore.Emodificadorestatic.dominio;

public class Carro {
    private String name;
    private double velocidadeMaxima;

    private static double velocidadeLimite = 250;



    public void imprimi(String name, double velocidadeMaxima, double velocidadeLimite) {
        System.out.println("Marca: " + name + " , VelocidadeMaxima: " + velocidadeMaxima
                + ", VelocidadeLimite: " + Carro.velocidadeLimite);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

}
