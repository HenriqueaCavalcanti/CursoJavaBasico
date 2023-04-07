package academy.devdojo.maratonajava.javacore.ZZEStream.test;

import academy.devdojo.maratonajava.javacore.ZZEStream.dominio.Category;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();

        List<String> graphicDesigners = List.of("Douglas", "Michelle");
        List<String> developers = List.of("Henrique", "Aleyskon", "Matheus");
        List<String> students = List.of("Weslley", "Ruan", "Kelvi");

        devDojo.add(graphicDesigners);
        devDojo.add(developers);
        devDojo.add(students);

         devDojo.stream().flatMap(Collection::stream).forEach(System.out::println);

//        for (List<String> people : devDojo) {
//            for (String person : people) {
//                System.out.println(person);
//            }
        }
    }
