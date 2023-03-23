package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println(isDiretorioCreated);
        File fileArquivoDiretorio = new File("C:\\Meus projetos Java\\DevDojo\\maratonajava\\pasta\\arquivo.txt");
        try {
            boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean c = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(c);

        File fileDiretorioRenamed = new File("Pasta2");
        boolean b = fileDiretorio.renameTo(fileDiretorioRenamed);
        System.out.println(b);
    }
}
