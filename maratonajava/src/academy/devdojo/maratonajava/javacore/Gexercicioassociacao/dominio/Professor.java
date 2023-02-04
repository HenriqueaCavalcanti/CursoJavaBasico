package academy.devdojo.maratonajava.javacore.Gexercicioassociacao.dominio;

public class Professor {
    private String name;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String name, String especialidade) {
        this.name = name;
        this.especialidade = especialidade;
    }

    public Professor(String name, String especialidade, Seminario[] seminarios) {
        this.name = name;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
