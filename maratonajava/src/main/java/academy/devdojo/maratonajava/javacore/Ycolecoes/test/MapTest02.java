package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Henrique");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");

        Manga manga1 = new Manga(10L, "Pokemon", 3);
        Manga manga2 = new Manga(2L, "Berserk", 5);
        Manga manga3 = new Manga(5L, "Attack on titan", 1);
        Manga manga4 = new Manga(4L, "Drangon Ball", 2);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor, manga2);
        consumidorManga.put(consumidor2, manga3);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getName() + " - " + entry.getValue().getNome());
        }
    }
}
