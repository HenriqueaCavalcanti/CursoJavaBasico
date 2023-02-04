package academy.devdojo.maratonajava.javacore.Dsobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Dsobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Tv", 12, "Naruto", "Ação");
/*Sobrecarga = Mesmo nome do método com quantidades
 ou tipos diferentes de parametro.*/
        anime.imprimi();
    }
}

