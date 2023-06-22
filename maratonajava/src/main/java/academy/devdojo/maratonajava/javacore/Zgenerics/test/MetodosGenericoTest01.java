package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodosGenericoTest01 {
    public static void main(String[] args) {

        List<Barco> canoa = criarArrayComUmObjeto(new Barco("Canoa"));
        System.out.println(canoa);

    }
//    private static <T> void criarArrayComUmObjeto(T t){
//        List<T> list = new ArrayList<>();
//        list.add(t);
//        System.out.println(list);
//
//    }

    private static <T> List<T> criarArrayComUmObjeto(T t){
      return List.of(t);
    }
}
