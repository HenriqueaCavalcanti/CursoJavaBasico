package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributes;

public class PosixFileAtributesTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("/root/file.txt");
        try {
            PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
            System.out.println(posixFileAttributes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
