package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Henrique", "Matheus"));
        nomes.sort(String::compareTo);
        System.out.println(nomes);
        Function<String, Integer> integerFunction =  Integer::parseInt;
        System.out.println(integerFunction.apply("10"));

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(nomes, "Henrique"));
    }
}
