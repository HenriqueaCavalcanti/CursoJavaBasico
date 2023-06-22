package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {

    public static void main(String[] args) {

        Professor professor = new Professor();

        professor.name = "Henrique";
        professor.idade = 25;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.name +", " + " Idade: " + professor.idade + ", " + " Sexo: " + professor.sexo
        );
    }
}
