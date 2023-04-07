package academy.devdojo.maratonajava.javacore.ZZEStream.test;

import java.util.List;
import java.util.Optional;

public class StreamTest06 {
    public static void main(String[] args) {
        final List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

        Optional<Integer> multiplicacao = list.stream().reduce((a, b) -> a * b);
        System.out.println(multiplicacao);

        list.stream().reduce((a, b) -> a * b).ifPresent(System.out::println);

        list.stream().reduce(Integer::sum).ifPresent(System.out::println);

        list.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);

        System.out.println(list.stream().reduce(0, Integer::max));
//        int resultado = 0;
//        for (Integer soma:list) {
//            resultado += soma;
//        }
//        System.out.println(resultado);
    }
}
