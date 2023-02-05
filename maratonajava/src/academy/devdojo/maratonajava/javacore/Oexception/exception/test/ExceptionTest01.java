package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo\\test.txt");
        try {
            boolean criado = file.createNewFile();
            System.out.println("Arquivo criado: " + criado);
        } catch (IOException e) {
            String menssagem = e.getMessage();
            System.out.println(menssagem);
        }

    }
}
