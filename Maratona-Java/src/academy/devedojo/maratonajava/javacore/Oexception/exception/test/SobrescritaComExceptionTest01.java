package academy.devedojo.maratonajava.javacore.Oexception.exception.test;

import academy.devedojo.maratonajava.javacore.Oexception.exception.domain.Funcionario;
import academy.devedojo.maratonajava.javacore.Oexception.exception.domain.LoginInvalidoException;
import academy.devedojo.maratonajava.javacore.Oexception.exception.domain.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario =new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
