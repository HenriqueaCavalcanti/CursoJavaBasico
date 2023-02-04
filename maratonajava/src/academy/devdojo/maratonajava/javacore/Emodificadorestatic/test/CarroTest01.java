package academy.devdojo.maratonajava.javacore.Emodificadorestatic.test;

import academy.devdojo.maratonajava.javacore.Emodificadorestatic.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Carro carro01 = new Carro();

        carro.imprimi("BMW", 300, Carro.getVelocidadeLimite());
        carro01.imprimi("Mercedes", 280, Carro.getVelocidadeLimite());

        Carro.setVelocidadeLimite(300);

        System.out.println("---------------------");
        carro.imprimi("BMW", 300, Carro.getVelocidadeLimite());
        carro01.imprimi("Mercedes", 280, Carro.getVelocidadeLimite());



    }
}
