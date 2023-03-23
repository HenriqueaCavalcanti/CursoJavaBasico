package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) {
        //BasicFileAttributes, DosFileAttributes, PosixFileAttributes
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("pasta2/novo.txt");

        Path path = Paths.get("pasta2/novo_path.txt");
        final FileTime from = FileTime.from(date.toInstant(ZoneOffset.UTC));

        try {
            boolean newFile = file.createNewFile();
            boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
           if (Files.notExists(path)){
               Files.createFile(path);
               Files.setLastModifiedTime(path, from);
           }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
