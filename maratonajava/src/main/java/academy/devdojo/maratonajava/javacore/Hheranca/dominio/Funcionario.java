package academy.devdojo.maratonajava.javacore.Hheranca.dominio;


public class Funcionario extends Pessoa{
    private double salario;


    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionario");
    }

     {
        System.out.println("Bloco de inicialização de funcionario 1");
    }

     {
        System.out.println("Bloco de inicialização de funcionario 2");
    }

    public Funcionario(String name){
        super(name);
        System.out.println("Dentro do construtor do funcionario");
    }

//Sobrescrita importa todos os atributos da superClasse
    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
