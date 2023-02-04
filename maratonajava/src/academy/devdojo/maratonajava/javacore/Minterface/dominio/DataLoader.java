package academy.devdojo.maratonajava.javacore.Minterface.dominio;

public interface DataLoader {
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro da interface");
    }
     void load();

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }
}
