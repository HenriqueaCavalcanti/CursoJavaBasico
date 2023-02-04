package academy.devdojo.maratonajava.javacore.Fassociacao.test;

import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("CAFU");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador};

        jogador.setTime(time);

        time.setJogadores(jogadores);
        System.out.println("Abaixo classe do Time");
        time.imprimi();
        System.out.println("Abaixo classe do jogador");
        jogador.imprimi();
    }
}
