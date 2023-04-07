package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTest01 {
//    Principal objetivo evitar null point Execption
//    Main objective to avoid null point Execption
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("JAVA");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        System.out.println(o2);
        System.out.println(o1);
        System.out.println(o3);

        Optional<String> nameOptional = findName("Henrique");
        String empty = nameOptional.orElse("Empty");
        System.out.println(empty);
//        System.out.println(nameOptional);

        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase(Locale.ROOT)));
    }
    private static Optional<String> findName(String name){
         List<String> list = List.of("Henrique", "Aleykson");
         int i = list.indexOf(name);
         if (i != -1){
             return Optional.of(list.get(i));
         }
         return Optional.empty();
    }
}
