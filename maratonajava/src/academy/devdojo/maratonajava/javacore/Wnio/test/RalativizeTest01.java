package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RalativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/henrique");
        Path clazz = Paths.get("/home/henrique/dev/olaMundo.ja");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absolut1 = Paths.get("/home/henrique");
        Path absolut2 = Paths.get("/usr/local");
        Path absolut3 = Paths.get("/home/henrique/dev/olaMundo.ja");
        Path relativo1 = Paths.get("temp/temp.2021921");
        Path relativo2 = Paths.get("temp");

        System.out.println("1 " + absolut1.relativize(absolut3));
        System.out.println("2 " + absolut3.relativize(absolut1));
        System.out.println("3 " + relativo1.relativize(relativo2));
    }
}
