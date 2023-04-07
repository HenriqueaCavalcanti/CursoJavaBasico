package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> carList = List.of(new Car("green", 2011), new Car("Black", 1993));

    public static void main(String[] args) {
        List<Car> green = filter(carList, car -> car.getCor().equals("green"));
        System.out.println(green);

        List<Integer> numerosPares = List.of(1,2,3,4,5,6);
        System.out.println(filter(numerosPares, num -> num % 2 == 0));
    }
   private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
       for (T e:list) {
           if (predicate.test(e)){
               filteredList.add(e);
           }
       }
       return filteredList;
   }
}
