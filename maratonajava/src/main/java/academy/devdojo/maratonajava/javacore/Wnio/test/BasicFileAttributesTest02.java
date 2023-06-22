package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("pasta2/subpasta/");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime fileTime = basicFileAttributes.creationTime();
        FileTime fileTime1 = basicFileAttributes.lastModifiedTime();
        FileTime fileTime2 = basicFileAttributes.lastAccessTime();

        System.out.println("CreationTime: " + fileTime);
        System.out.println("lastModifiedTime: " + fileTime1);
        System.out.println("lastAccessTime: " + fileTime2);
        System.out.println("----------");

        final BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        final FileTime fileTime3 = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(fileTime1, fileTime3, fileTime);


    }
}
