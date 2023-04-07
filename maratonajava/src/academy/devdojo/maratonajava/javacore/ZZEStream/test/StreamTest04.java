package academy.devdojo.maratonajava.javacore.ZZEStream.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest04 {
    public static void main(String[] args) {
       List<String> words = List.of("Gomu", "Gomu", "No", "Mi");

//       String[] split = words.get(0).split("");
//       System.out.println(Arrays.toString(split));

         List<String> letters = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
                System.out.println(letters);
    }
}
