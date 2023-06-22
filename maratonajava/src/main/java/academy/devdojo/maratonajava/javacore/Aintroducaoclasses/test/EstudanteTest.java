package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.name = "Henrique";
        estudante.idade = 2;
        estudante.sexo = 'M';


        System.out.printf("Nome:%s\nIdade:%d\nSexo:%s ", estudante.name, estudante.idade, estudante.sexo);
    }
}
