package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Henrique");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");

        Manga manga1 = new Manga(10L, "Pokemon", 3);
        Manga manga2 = new Manga(2L, "Berserk", 5);
        Manga manga3 = new Manga(5L, "Attack on titan", 1);
        Manga manga4 = new Manga(4L, "Drangon Ball", 2);


        List<Manga> mangaConsumidor1List = List.of(manga1, manga3);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor, mangaConsumidor1List);
        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()){
            System.out.print(entry.getKey().getName());
            System.out.println(": ");
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());

            }
        }

    }
}
