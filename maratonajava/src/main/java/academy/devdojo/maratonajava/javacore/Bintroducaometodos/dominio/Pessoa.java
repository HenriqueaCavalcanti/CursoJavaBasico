package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String name;
    private int idade;


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        if (idade < 0){
            System.out.println("Idade invalida");
            return;
        }
         this.idade = idade;
    }
    public void imprimir(){
        System.out.println(this.name);
        System.out.println(this.idade);
    }
}
