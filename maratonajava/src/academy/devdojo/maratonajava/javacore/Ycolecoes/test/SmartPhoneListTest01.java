package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.SmartPhone;

import java.util.ArrayList;
import java.util.List;

public class SmartPhoneListTest01 {
    public static void main(String[] args) {
        SmartPhone smartPhone1 = new SmartPhone("1ABC1", "Iphone");
        SmartPhone smartPhone2 = new SmartPhone("2222", "Pixel");
        SmartPhone smartPhone3 = new SmartPhone("3333", "Sansung");
        List<SmartPhone> list = new ArrayList<>();

        list.add(smartPhone1);
        list.add(smartPhone2);
        list.add(smartPhone3);
        for (SmartPhone a : list) {
            System.out.println(a);
        }
        SmartPhone smartPhone4 = new SmartPhone("3333", "Sansung");
        boolean contains = list.contains(smartPhone4);
        System.out.println(contains);

        int index = list.indexOf(smartPhone4);

        System.out.println(list.get(index));
    }
}
