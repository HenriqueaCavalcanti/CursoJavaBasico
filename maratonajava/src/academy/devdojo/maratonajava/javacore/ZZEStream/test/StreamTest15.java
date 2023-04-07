package academy.devdojo.maratonajava.javacore.ZZEStream.test;

import academy.devdojo.maratonajava.javacore.ZZEStream.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEStream.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEStream.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest15 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("One piece", 3.99, Category.DRAMA),
            new LightNovel("One piece", 7.99, Category.DRAMA),
            new LightNovel("Dragon ball", 6.99, Category.FANTASY),
            new LightNovel("Caverna do Dragão", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 10.99, Category.ROMANCE),
            new LightNovel("Violet Evergarden", 3.99, Category.FANTASY)));

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;
        sumFor(num);
        System.out.println();
        sumStreamIterate(num);
        System.out.println();
        sumParallelStreamIterate(num);
        System.out.println();
        sumLongStreamIterate(num);
    }


    private static void sumStreamIterate(long num){
        System.out.println("Sum for: ");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongStreamIterate(long num){
        System.out.println("Sum for: ");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelStreamIterate(long num){
        System.out.println("Sum for: ");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }


    private static void sumFor(long num){
        System.out.println("Sum for: ");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i<= num; i++){
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
}
