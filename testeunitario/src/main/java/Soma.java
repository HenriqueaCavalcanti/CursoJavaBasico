public class Soma {
    public int soma (int numero1 ,int numero2) throws Exception {
       if (numero1 > 3){
           numero1++;
       }
       if (numero1 == 0){
           throw new Exception("Numero 1 não pode ser zero");
       }
        return numero1 + numero2;
    }

    public int multiplica(int numero1 ,int numero2) throws Exception {
        int resultadoDaMultiplicacao = numero1 * numero2;
        return soma(resultadoDaMultiplicacao, numero2);
    }

}
