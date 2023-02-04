package academy.devdojo.maratonajava.javacore.Gexercicioassociacao.test;

import academy.devdojo.maratonajava.javacore.Gexercicioassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gexercicioassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gexercicioassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gexercicioassociacao.dominio.Seminario;

public class GerenciandoSeminariosTest {
    public static void main(String[] args) {

        Local local = new Local("Rua ademar");
        Aluno aluno2 = new Aluno("Matheus", 25);
        Aluno aluno1 = new Aluno("Henrique", 26);

        Seminario seminario = new Seminario("Aprendendo a Desenvolver", new Aluno[]{aluno2, aluno1}, local);

        Professor professor = new Professor("Rafael", "Analista", new Seminario[]{seminario});
        aluno1.imprimi();
        System.out.println("---------");
        seminario.imprimi();
    }
}
