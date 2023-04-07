package academy.devdojo.maratonajava.javacore.ZZEStream.test;

import academy.devdojo.maratonajava.javacore.ZZEStream.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEStream.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEStream.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest13 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("One piece", 3.99, Category.DRAMA),
            new LightNovel("Dragon ball", 6.99, Category.FANTASY),
            new LightNovel("Overlord", 10.99, Category.ROMANCE),
            new LightNovel("Violet Evergarden", 3.99, Category.FANTASY)));

    public static void main(String[] args) {
         Map<Category, Long> collect = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
         System.out.println(collect);

         Map<Category, Optional<LightNovel>> collect1 = lightNovelList.stream().
                 collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
         System.out.println();
         Map<Category, LightNovel> collect2 = lightNovelList.stream()
                 .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
         System.out.println(collect2);
    }
}
