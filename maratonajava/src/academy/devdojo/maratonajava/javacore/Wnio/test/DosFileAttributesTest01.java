package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DosFileAttributesTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("pasta/testee.txt");
        try {
           if (Files.notExists(path)) Files.createFile(path);
               Files.setAttribute(path, "dos:hidden", true);
               Files.setAttribute(path, "dos:readonly", true);
               Files.setAttribute(path, "dos:hidden", false);
               Files.setAttribute(path, "dos:readonly", false);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
