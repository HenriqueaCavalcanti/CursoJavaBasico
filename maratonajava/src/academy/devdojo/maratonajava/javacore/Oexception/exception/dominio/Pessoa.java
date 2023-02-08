package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando pessoa");
    }
}
