package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsTest01 {
    public static void main(String[] args) {
         Path path = Paths.get("C:\\Meus projetos Java\\DevDojo\\maratonajava\\file.txt");
        System.out.println(path.getFileName().toFile());
    }
}
