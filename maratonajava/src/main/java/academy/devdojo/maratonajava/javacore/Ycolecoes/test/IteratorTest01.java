package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();

        mangas.add(new Manga(10L, "Pokemon", 3, 0));
        mangas.add(new Manga(2L, "Berserk", 5, 6));
        mangas.add(new Manga(5L, "Attack on titan", 1, 2));
        mangas.add(new Manga(4L, "Drangon Ball", 2, 0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            if (mangaIterator.next().getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
