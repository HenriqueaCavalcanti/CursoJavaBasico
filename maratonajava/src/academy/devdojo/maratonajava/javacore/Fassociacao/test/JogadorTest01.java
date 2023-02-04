package academy.devdojo.maratonajava.javacore.Fassociacao.test;

import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Neymar");
        Jogador jogador3 = new Jogador("Cristiano Ronaldo");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};


        for (Jogador jogadore : jogadores) {
            System.out.println(jogadore);
        }

    }
}
