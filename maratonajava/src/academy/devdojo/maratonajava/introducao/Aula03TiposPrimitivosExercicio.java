package academy.devdojo.maratonajava.introducao;

import javax.xml.crypto.Data;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

        String name = "Henrique";
        String endereço = "Rua prefeito antonio";
        double salario = 2500;
        String data = "08/12/2022";

        String relatorio = "Eu " + name + ", morando no endereço " + endereço + ", confirmo " +
                "que recebi o salário de " + salario + ", na data " + data;

        System.out.println(relatorio);

    }
}
