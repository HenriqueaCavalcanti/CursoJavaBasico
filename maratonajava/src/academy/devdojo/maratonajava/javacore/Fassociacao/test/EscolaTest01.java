package academy.devdojo.maratonajava.javacore.Fassociacao.test;

import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Carlos");
        Professor professor1 = new Professor("Henrique");

        Escola escola = new Escola("Kenoha");

        escola.setProfessores(new Professor[]{professor, professor1});

        escola.imprimi();
    }
}
