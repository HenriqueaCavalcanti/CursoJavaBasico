package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) {
        Path pasta2 = Paths.get("Pasta2");
        try {
            if (Files.notExists(pasta2)) {
                Path directory = Files.createDirectory(pasta2);
                System.out.println(directory);
            }
            System.out.println("Pasta existente");

        } catch (IOException e) {
            e.printStackTrace();
        }

        Path subpastaPath = Paths.get("Pasta2/subpasta/subsubpasta");
        try {
            Path subPastaDirectory = Files.createDirectories(subpastaPath);
            System.out.println(subPastaDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path filePath = Paths.get(subpastaPath.toString(), "file.txt");
        try {
            if (Files.notExists(filePath)){
                Path file = Files.createFile(filePath);
                System.out.println(file);
            }
            System.out.println("Arquivo existente");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_rename.txt");
        try {
            Path copy = Files.copy(filePath, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println(copy);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
