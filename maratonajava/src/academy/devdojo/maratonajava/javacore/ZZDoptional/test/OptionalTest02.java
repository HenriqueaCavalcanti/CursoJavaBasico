package academy.devdojo.maratonajava.javacore.ZZDoptional.test;


import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio.MangaRepositorio;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) throws IllegalAccessException {
         Optional<Manga> mangaByTitle = MangaRepositorio.findByTitle("Dragon Ball");
         mangaByTitle.ifPresent(manga -> manga.setTitle("Vingadores"));
         System.out.println(mangaByTitle);

            Manga manga = MangaRepositorio.findById(2).orElseThrow(IllegalAccessException::new);

        Optional<Manga> byChapters = MangaRepositorio.findByChapters(1000);
        System.out.println(byChapters);

    }
}
