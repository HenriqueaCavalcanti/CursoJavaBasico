package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class sortMangaByIdComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();

        mangas.add(new Manga (10L, "Pokemon", 3));
        mangas.add(new Manga(2L, "Berserk", 5));
        mangas.add(new Manga(5L, "Attack on titan", 1));
        mangas.add(new Manga(4L, "Drangon Ball", 2));

        Collections.sort(mangas);
        for (Manga manga: mangas) {
            System.out.println(manga);
        }
        System.out.println("-----------");
//        Collections.sort(mangas,new sortMangaByIdComparator());
        mangas.sort(new sortMangaByIdComparator());
        for (Manga manga: mangas) {
            System.out.println(manga);
        }
    }
}
