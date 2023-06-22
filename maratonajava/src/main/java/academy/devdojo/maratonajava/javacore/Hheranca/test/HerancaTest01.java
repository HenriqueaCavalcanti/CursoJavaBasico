package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();

        endereco.setRua("Rua 3");
        endereco.setCep("125344-059");

        Pessoa pessoa = new Pessoa("Henrique");
        pessoa.setCpf("121.45456");

        pessoa.setEndereco(endereco);

        pessoa.imprime();
        System.out.println("-----");
        Funcionario funcionario = new Funcionario("Marcos");

        funcionario.setCpf("26666464");
        funcionario.setSalario(2564.00);

        funcionario.setEndereco(endereco);
        funcionario.imprime();
    }
}
