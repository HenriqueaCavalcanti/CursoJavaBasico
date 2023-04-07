package academy.devdojo.maratonajava.javacore.ZZEStream.test;

import academy.devdojo.maratonajava.javacore.ZZEStream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest10 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("One piece", 3.99),
            new LightNovel("Dragon ball", 1.99),
            new LightNovel("Overlord", 10.99),
            new LightNovel("Violet Evergarden", 3.99)));

    public static void main(String[] args) {
        System.out.println(lightNovelList.stream().count());
        System.out.println(lightNovelList.stream().collect(Collectors.counting()));

        lightNovelList.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovelList.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

        System.out.println(lightNovelList.stream().mapToDouble(LightNovel::getPrice).sum());
        System.out.println(lightNovelList.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        DoubleSummaryStatistics collect = lightNovelList.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);

        String titles = lightNovelList.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);
    }
}
