package academy.devdojo.maratonajava.javacore.Fassociacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;

    public void imprimi(){
        System.out.println("Escola: " + this.nome);
        if (professores == null){
            return;
        }
        System.out.println("Nome dos professores: ");
        for (Professor professore : professores) {
            System.out.println(professore.getNome());professore.getNome();
        }

    }

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores){
        this(nome);
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
