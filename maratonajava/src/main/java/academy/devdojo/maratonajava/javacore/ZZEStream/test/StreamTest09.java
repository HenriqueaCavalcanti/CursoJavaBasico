package academy.devdojo.maratonajava.javacore.ZZEStream.test;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
//        Stream.iterate(1, n -> n + 2).limit(10).forEach(n -> System.out.print(n + " "));
//        System.out.println();
//        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]}).limit(10).forEach(a -> System.out.print(Arrays.toString(a)));
//        System.out.println();

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        boolean b = Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]}).limit(50).map(a -> a[0]).anyMatch(c -> c == i);
        if (b){
            System.out.println("O numero " + i + " Faz parte? " + b);
        } else {
            System.out.println("Não existe");
        }

        System.out.println(b);
        System.out.println();

//        ThreadLocalRandom random = ThreadLocalRandom.current();
//
//        Stream.generate(() -> random.nextInt(1, 500)).limit(90).forEach(System.out::println);
    }
}
