package academy.devdojo.maratonajava.javacore.ZZClambdas.service;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime a1, Anime a2){
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public static int compareByEpisodios(Anime a1, Anime a2){
        return Integer.compare(a1.getEpisodios(), a2.getEpisodios());
    }

    public int compareByEpisodiosNonStatic(Anime a1, Anime a2){
        return Integer.compare(a1.getEpisodios(), a2.getEpisodios());
    }
}
