package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
//        Com interface trabalhamos com o tipo mais generico,
//        nesse caso é o repositorio.
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
