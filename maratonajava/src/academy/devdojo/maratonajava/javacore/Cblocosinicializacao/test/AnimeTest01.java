package academy.devdojo.maratonajava.javacore.Cblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Cblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime("Naruto");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
