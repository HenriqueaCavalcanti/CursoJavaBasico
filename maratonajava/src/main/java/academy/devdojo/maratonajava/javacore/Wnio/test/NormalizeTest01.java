package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/henrique/dev";
        String arquivotxt = "../../arquivo.txt";
        Path path = Paths.get(diretorioProjeto, arquivotxt);
        System.out.println(path);
        System.out.println(path.normalize());

        if (Files.notExists(path)){
            try {
                Files.createFile(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
