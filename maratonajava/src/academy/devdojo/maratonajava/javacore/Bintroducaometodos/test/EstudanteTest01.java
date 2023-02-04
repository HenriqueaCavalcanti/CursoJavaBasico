package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();



        estudante.name = "Henrique";
        estudante.idade = 15;
        estudante.sexo = 'M';
        impressoraEstudante.imprime(estudante);
        System.out.println("-------");
        estudante02.name = "Maria";
        estudante02.idade = 15;
        estudante02.sexo = 'F';

        impressoraEstudante.imprime(estudante);
    }

}
