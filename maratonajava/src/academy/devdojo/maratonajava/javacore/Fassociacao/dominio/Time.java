package academy.devdojo.maratonajava.javacore.Fassociacao.dominio;

public class Time {
    private String name;
    private Jogador[] jogadores;

    public Time(String name, Jogador[] jogadores) {
        this.name = name;
        this.jogadores = jogadores;
    }

    public Time(String name) {
        this.name = name;
    }

    public void imprimi(){
        System.out.println(this.name);
        if (jogadores == null){
            return;
        }
        for (Jogador jogadore : jogadores) {
            System.out.println(jogadore.getName());
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    @Override
    public String toString() {
        return this.name;

    }
}
