package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante02 = new Estudante();



        estudante.name = "Henrique";
        estudante.idade = 15;
        estudante.sexo = 'M';
        estudante.imprime();

        estudante02.name = "Maria";
        estudante02.idade = 15;
        estudante02.sexo = 'F';
        estudante02.imprime();
    }
}
