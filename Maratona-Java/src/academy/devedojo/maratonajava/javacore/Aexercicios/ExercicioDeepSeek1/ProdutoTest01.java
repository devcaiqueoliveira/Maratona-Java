package academy.devedojo.maratonajava.javacore.Aexercicios.ExercicioDeepSeek1;

import java.util.Scanner;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto[] produtos = new Produto[5];

        for (int i = 0; i < produtos.length; i++) {

            System.out.println("\n--- Cadastro do Produto " + (i + 1) + " ---");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            sc.nextLine();

            produtos[i] = new Produto(nome, preco);
        }

        System.out.println("\n--- PRODUTOS ANTES DO DESCONTO ---");
        for (Produto produto : produtos) {
            System.out.printf("%s - R$ %.2f%n", produto.getNome(), produto.getPreco());
        }

        for (Produto produto : produtos) {
            produto.aplicarDesconto(10);
        }

        System.out.println("\n--- PRODUTOS COM 10% DE DESCONTO ---");
        for (Produto produto : produtos){
            System.out.printf("%s - R$ %.2f%n", produto.getNome(), produto.getPreco());
        }
        sc.close();
    }
}
