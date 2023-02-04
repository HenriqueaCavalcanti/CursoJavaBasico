package academy.devdojo.maratonajava.javacore.Minterface.test;

import academy.devdojo.maratonajava.javacore.Minterface.dominio.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.Minterface.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterface.dominio.FileLoarder;

public class DataLoarderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoarder fileLoarder = new FileLoarder();

        dataBaseLoader.load();
        fileLoarder.load();
        
        dataBaseLoader.checkPermission();
        fileLoarder.checkPermission();
        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();


    }
}
