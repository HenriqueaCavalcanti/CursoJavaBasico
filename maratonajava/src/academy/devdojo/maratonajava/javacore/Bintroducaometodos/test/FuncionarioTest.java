package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;


import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setName("Henrique");
        funcionario.setIdade(25);
        double [] salarios = {};
        funcionario.setSalario(salarios);

        funcionario.imprimir();
        System.out.println();
        System.out.println(funcionario.getMedia());

    }
}
