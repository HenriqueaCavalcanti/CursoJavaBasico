package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2){
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class QueueTest02 {
    public static void main(String[] args) {

        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());

        mangas.add(new Manga(10L, "Pokemon", 3));
        mangas.add(new Manga(2L, "Berserk", 5));
        mangas.add(new Manga(5L, "Attack on titan", 1));
        mangas.add(new Manga(4L, "Drangon Ball", 2));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }

    }
}
