package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {

//        O set não permite elementos duplicados dentro da coleção.
        Set<Manga> mangas = new HashSet<>();

        mangas.add(new Manga(10L, "Pokemon", 3));
        mangas.add(new Manga(2L, "Berserk", 5));
        mangas.add(new Manga(5L, "Attack on titan", 1));
        mangas.add(new Manga(4L, "Drangon Ball", 2));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
