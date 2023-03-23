package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(10L, "Pokemon", 3));
        mangas.add(new Manga(2L, "Berserk", 5));
        mangas.add(new Manga(5L, "Attack on titan", 1));
        mangas.add(new Manga(4L, "Drangon Ball", 2));
        Collections.sort(mangas);
//        (-(ponto de inserção) -1)
        Manga mangaToSearch = new Manga(4L, "Drangon Ball", 2);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch));
    }
}
