package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculabonus();
    }

    @Override
    public void imprime() {
        System.out.println("Imprime");
    }

    public abstract void calculabonus();
}
