package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Pokemon");
        mangas.add("Attack on titan");
        mangas.add("Berserk");
        mangas.add("Dragon Ball z");
        Collections.sort(mangas);
        final int berserk = mangas.indexOf("Berserk");
        System.out.println(berserk);
        for (String manga : mangas) {
            System.out.println(manga);
        }

        Manga manga = new Manga(1L, "Drangon Ball", 0);
        System.out.println(manga);
    }
}
