package academy.devdojo.maratonajava.javacore.Fassociacao.dominio;

public class Jogador {
    private String name;
    private Time time;

    public Jogador(String name) {
        this.name = name;
    }


    public void imprimi(){
        System.out.println(this.name);
        if (time != null){
            System.out.println(time.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Name: " + this.name +
                "\n" +
                "Time: " + time.getName();
    }
}
