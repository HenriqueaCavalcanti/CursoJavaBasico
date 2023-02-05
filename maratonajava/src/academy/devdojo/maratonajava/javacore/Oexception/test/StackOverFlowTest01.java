package academy.devdojo.maratonajava.javacore.Oexception.test;

public class StackOverFlowTest01 {
//    Error => Provavelmente não tera como arrumar em tempo,
//    de execução.
    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }
}

