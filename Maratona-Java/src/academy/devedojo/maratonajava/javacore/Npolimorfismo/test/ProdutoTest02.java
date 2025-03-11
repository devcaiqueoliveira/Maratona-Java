package academy.devedojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devedojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devedojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devedojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Computarin", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("-------------------");

        Produto produto2 = new Tomate("Americano", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
