package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

//        Doar se salário for maior que 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNãoDoar = "Ainda não tenho condições, mas vou ter!";
//       Operador Ternário: String resultado = (condicao) ? verdadeiro : false;
        String resultado = salario > 5000 ? mensagemDoar : mensagemNãoDoar;

        System.out.println(resultado);

    }
}