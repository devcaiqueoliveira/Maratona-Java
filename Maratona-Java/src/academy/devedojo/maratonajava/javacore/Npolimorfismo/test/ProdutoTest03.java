package academy.devedojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devedojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devedojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devedojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devedojo.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Computarin", 3000);

        Tomate produto2 = new Tomate("Americano", 20);
        produto2.setDataValidade("11/12/2025");
        CalculadoraImposto.calcularImposto(produto2);
        System.out.println("-------------------------------");
        CalculadoraImposto.calcularImposto(produto);

    }

}
