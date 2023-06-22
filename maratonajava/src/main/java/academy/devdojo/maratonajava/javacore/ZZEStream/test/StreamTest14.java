package academy.devdojo.maratonajava.javacore.ZZEStream.test;

import academy.devdojo.maratonajava.javacore.ZZEStream.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEStream.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEStream.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("One piece", 3.99, Category.DRAMA),
            new LightNovel("One piece", 7.99, Category.DRAMA),
            new LightNovel("Dragon ball", 6.99, Category.FANTASY),
            new LightNovel("Caverna do Dragão", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 10.99, Category.ROMANCE),
            new LightNovel("Violet Evergarden", 3.99, Category.FANTASY)));

    public static void main(String[] args) {
        final Map<Category, DoubleSummaryStatistics> collect = lightNovelList.stream().
                collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        System.out.println();

        Map<Category, Set<Promotion>> collect1 = lightNovelList.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest14::getPromotion, Collectors.toSet())));
        System.out.println(collect1);

        System.out.println();

        Map<Category, LinkedHashSet<Promotion>> collect2 = lightNovelList.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest14::getPromotion, Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collect2);

    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
