package academy.devdojo.maratonajava.javacore.ZZEStream.test;

import academy.devdojo.maratonajava.javacore.ZZEStream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest07 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("One piece", 3.99),
            new LightNovel("Dragon ball", 1.99),
            new LightNovel("Overlord", 10.99),
            new LightNovel("Violet Evergarden", 3.99)));
    public static void main(String[] args) {
        lightNovelList.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 4)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = lightNovelList.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 4)
                .sum();

    }
}
