package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String name;
    private int idade;
    private double[] salario;
    private double media;


    public Funcionario() {
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        double soma = 0;
        for (double salarios : this.salario) {
            soma += salarios;
        }
        this.media = soma / this.salario.length;
        return media;
    }

    public void imprimir() {
        System.out.println("----");
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.idade + " Anos");
        for (int i = 0; i < salario.length; i++) {
            System.out.print(salario[i]);
            for (int j = 0; j < salario.length - 2; j++) {
                if (i < 2) {
                    System.out.print(", ");
                }
            }
        }
    }
}
