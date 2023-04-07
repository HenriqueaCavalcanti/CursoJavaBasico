package academy.devdojo.maratonajava.javacore.ZZEStream.test;

import academy.devdojo.maratonajava.javacore.ZZEStream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("One piece", 3.99),
            new LightNovel("Dragon ball", 5.99),
            new LightNovel("Overlord", 2.99),
            new LightNovel("Violet Evergarden", 3.99)));

    public static void main(String[] args) {
        lightNovelList.sort(Comparator.comparing(LightNovel::getTitle));
        System.out.println(lightNovelList);
        List<String> title = new ArrayList<>();
        for (LightNovel lightNovel:lightNovelList) {
            if (lightNovel.getPrice() <= 4){
                 title.add(lightNovel.getTitle());
            }
            if (title.size() >= 3){
                break;
            }
        }
        System.out.println(title);
    }

    private static boolean Boolean (LightNovel c) {
        return c.getTitle().equals(c.getTitle());
    }
}
