package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
//        while, do while, for.
        int count = 0;

        while (count < 10) {
            System.out.println(count);
            count++;
        }

        do {
            System.out.println("Dentro do do-while");
        } while (count < 10);

        count = 3;
        for (int i = 0; i<count; i++){
            for (int j = 0; j<count; j++){
                System.out.println("Segundo:" + j);
            }
            System.out.println("Primeiro: " + i);
        }
    }
}
