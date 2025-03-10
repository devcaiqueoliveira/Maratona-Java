package academy.devedojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devedojo.maratonajava.javacore.Lclassesabstratas.domain.Desenvolvedor;
import academy.devedojo.maratonajava.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Goku", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
