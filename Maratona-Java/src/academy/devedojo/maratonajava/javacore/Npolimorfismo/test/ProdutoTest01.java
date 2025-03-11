package academy.devedojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devedojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devedojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devedojo.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Computador 1", 6000);
        Tomate tomate = new Tomate("Tomate 1", 15);

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("=============");
        CalculadoraImposto.calcularImposto(computador);
    }
}
