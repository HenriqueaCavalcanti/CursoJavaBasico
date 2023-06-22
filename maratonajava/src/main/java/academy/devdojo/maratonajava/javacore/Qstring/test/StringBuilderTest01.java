package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Henrique Alves";
        nome.concat(" DevDojo");

        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Henrique");
        sb.append(" DevDOJO");
        System.out.println(sb);
    }
}