package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {

        int idade = 20;
        boolean isAutorizadoCompraDeBebida = idade > 18;
        if (isAutorizadoCompraDeBebida) {
            System.out.println("Autorizado");
        }
        else {
            System.out.println("Não comprou");
        }
        if (!isAutorizadoCompraDeBebida){
            System.out.println("não foi autorizado");
        }

        System.out.println("fora do if ");
    }
}
