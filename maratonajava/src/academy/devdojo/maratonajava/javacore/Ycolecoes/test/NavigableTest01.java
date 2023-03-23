package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.SmartPhone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmatphoneMarcaComparator implements Comparator<SmartPhone> {

    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableTest01 {
    public static void main(String[] args) {

        NavigableSet<SmartPhone> set = new TreeSet<>(new SmatphoneMarcaComparator());

        SmartPhone smartPhone = new SmartPhone("FFF", "Samsung");
        SmartPhone smartPhone1 = new SmartPhone("FFF", "Samsung");
        SmartPhone smartPhone2 = new SmartPhone("FFF", "Samsung");

        set.add(smartPhone);
        System.out.println(smartPhone);
        System.out.println("-----");
        NavigableSet<Manga> mangas = new TreeSet<>();

        mangas.add(new Manga(10L, "Pokemon", 3));
        mangas.add(new Manga(2L, "Berserk", 5));
        mangas.add(new Manga(5L, "Attack on titan", 1));
        mangas.add(new Manga(4L, "Drangon Ball", 2));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
//        lower <
//        floor <=
//        higher >
//        ceiling >=
    }
}
