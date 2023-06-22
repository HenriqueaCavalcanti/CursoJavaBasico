package academy.devdojo.maratonajava.javacore.Gexercicioassociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;


    public void imprimi(){
        System.out.println("Titulo: " + titulo);
        System.out.print("Aluno(s): ");


            for (int i = 0; i < alunos.length; i++) {
                System.out.print(alunos[i].getName());
                if (i != alunos.length - 1){
                    System.out.print(", ");
                }
        }
        System.out.println();
        System.out.println("Local: " + local.getEndereco());

    }

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
       this(titulo, local);
       this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}

