package academy.devdojo.maratonajava.javacore.Gexercicioassociacao.dominio;

public class Aluno {
    private String name;
    private int idade;
    private Seminario seminario;



    public void imprimi(){
        System.out.println("Aluno: " + this.name
        + "\n" + "Idade: " + this.idade);
        if (seminario != null){
            System.out.println("Nome do seminario: " + seminario.getTitulo());
            System.out.println("Local: " + seminario.getLocal().getEndereco());

        } else {
            return;
        }
    }

    public Aluno(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public Aluno(String name, int idade, Seminario seminario) {
        this.name = name;
        this.idade = idade;
        this.seminario = seminario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
