package academy.devdojo.maratonajava.javacore.ZZEStream.test;

import academy.devdojo.maratonajava.javacore.ZZEStream.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEStream.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEStream.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("One piece", 3.99, Category.DRAMA),
            new LightNovel("Dragon ball", 6.99, Category.FANTASY),
            new LightNovel("Overlord", 10.99, Category.ROMANCE),
            new LightNovel("Violet Evergarden", 3.99, Category.FANTASY)));

    public static void main(String[] args) {

         Map<Promotion, List<LightNovel>> collect = lightNovelList.stream().collect(Collectors.groupingBy(c -> c.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));
         System.out.println(collect);
         System.out.println();
         Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.groupingBy(c -> c.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)));
         System.out.println(collect1);
    }
}
