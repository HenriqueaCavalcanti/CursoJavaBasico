package academy.devdojo.maratonajava.javacore.Minterface.dominio;

public class FileLoarder implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo arquivo");
    }
}
