package academy.devdojo.maratonajava.javacore.ZZEStream.test;

import academy.devdojo.maratonajava.javacore.ZZEStream.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEStream.dominio.LightNovel;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("One piece", 3.99, Category.DRAMA),
            new LightNovel("Dragon ball", 1.99, Category.FANTASY),
            new LightNovel("Overlord", 10.99, Category.ROMANCE),
            new LightNovel("Violet Evergarden", 3.99, Category.FANTASY)));
    public static void main(String[] args) {
//        Map<Category, List<LightNovel>> categoryListMap = new HashMap<>();
//        List<LightNovel> fantasy = new ArrayList<>();
//        List<LightNovel> romance = new ArrayList<>();
//        List<LightNovel> drama = new ArrayList<>();
//
//        for (LightNovel lightNovel : lightNovelList) {
//            switch (lightNovel.getCategory()){
//                case DRAMA: drama.add(lightNovel);break;
//                case FANTASY: fantasy.add(lightNovel);break;
//                case ROMANCE: romance.add(lightNovel);break;
//            }
//        }
//        categoryListMap.put(Category.DRAMA, drama);
//        categoryListMap.put(Category.FANTASY, fantasy);
//        categoryListMap.put(Category.ROMANCE, romance);
//        System.out.println(categoryListMap);


        Map<Category, List<LightNovel>> collect = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
