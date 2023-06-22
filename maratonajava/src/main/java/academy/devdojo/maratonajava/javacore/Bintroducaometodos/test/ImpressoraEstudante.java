package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class ImpressoraEstudante {

    public void imprime(Estudante estudante){
        System.out.println(estudante.name);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
