package academy.devdojo.maratonajava.javacore.ZZEStream.test;

import academy.devdojo.maratonajava.javacore.ZZEStream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("One piece", 3.99),
            new LightNovel("Dragon ball", 1.99),
            new LightNovel("Overlord", 5.99),
            new LightNovel("Violet Evergarden", 3.99)));

    public static void main(String[] args) {
       List<String> collect = lightNovelList.stream()
               .sorted(Comparator.comparing(LightNovel::getTitle))
               .filter(c -> c.getPrice() <= 4)
               .limit(3).map(LightNovel::getTitle)
               .collect(Collectors.toList());
       System.out.println(collect);

        final long count = lightNovelList.stream().filter(c -> c.getPrice() <= 4).distinct().count();
        System.out.println(count);

        lightNovelList.forEach(System.out::println);

    }
}
