package academy.devedojo.maratonajava.javacore.Oexception.exception.test;

import academy.devedojo.maratonajava.javacore.Oexception.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner text = new Scanner(System.in);
        String usuarioDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuario");
        String usuarioDigitado = text.nextLine();
        System.out.println("Senha");
        String senhaDigitada = text.nextLine();
        if (!usuarioDB.equals(usuarioDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuario ou Senha invalido");
        }
        System.out.println("Usuario Logado Com Sucesso!");
    }
}