package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);

        String usernameBD = "Goku";
        String senhaDB = "ssj";

        System.out.print("Usuario: ");
        String usernameDigitado = sc.nextLine();
        System.out.print("Senha: ");
        String senhaDigitada = sc.nextLine();
        if (!usernameBD.equals(usernameDigitado) || !senhaDigitada.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Login invalido");
        }
        System.out.println("LOGADO");
    }
}
