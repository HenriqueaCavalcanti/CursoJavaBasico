package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            System.out.println("Resultado: " + divisao(3, 2));

        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Codigo finalizado");
    }

    /**
     *
     * @param a
     * @param b - não pode ser zero
     * @return
     * @throws IllegalArgumentException
     */
    private static int divisao(int a, int b){
        if (b == 0) {
            throw new IllegalArgumentException("O denominador não pode ser 0");
        }
        return a/b;
    }
}
