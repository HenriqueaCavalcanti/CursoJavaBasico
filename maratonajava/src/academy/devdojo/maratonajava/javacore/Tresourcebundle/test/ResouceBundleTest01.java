package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResouceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt_BR"));
        System.out.println((bundle.getString("hello")));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hi"));
        ResourceBundle bundle1 = ResourceBundle.getBundle("messages", new Locale("en_US"));
        System.out.println((bundle1.getString("hello")));
        System.out.println(bundle1.getString("good.morning"));

        System.out.println(bundle.getString("hi"));

    }
}
