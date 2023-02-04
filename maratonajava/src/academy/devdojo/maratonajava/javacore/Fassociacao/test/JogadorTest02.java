package academy.devdojo.maratonajava.javacore.Fassociacao.test;

import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Pele");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);

        jogador1.imprimi();


    }
}
