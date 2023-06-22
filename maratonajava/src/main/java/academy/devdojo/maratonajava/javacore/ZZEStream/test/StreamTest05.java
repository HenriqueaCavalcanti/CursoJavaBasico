package academy.devdojo.maratonajava.javacore.ZZEStream.test;

import academy.devdojo.maratonajava.javacore.ZZEStream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest05 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("One piece", 3.99),
            new LightNovel("Dragon ball", 1.99),
            new LightNovel("Overlord", 10.99),
            new LightNovel("Violet Evergarden", 3.99)));
    public static void main(String[] args) {
        boolean b = lightNovelList.stream().anyMatch(lightNovel -> lightNovel.getPrice() > 8); /* anyMatch - Vai fazer uma busca para verificar se existe algo em comparação
        com a condição. */
        System.out.println(b);

        System.out.println(lightNovelList.stream().allMatch(lightNovel -> lightNovel.getPrice()>0)); /*allMatch- Verifica se todos são de acordo com a condição */
        System.out.println(lightNovelList.stream().noneMatch(lightNovel -> lightNovel.getPrice() < 0));/* noneMatch-verifica se algum elemento não é de acordo com a condição */
        lightNovelList.stream().filter(lightNovel -> lightNovel.getPrice() > 3).findAny().ifPresent(System.out::println);
    }
}
