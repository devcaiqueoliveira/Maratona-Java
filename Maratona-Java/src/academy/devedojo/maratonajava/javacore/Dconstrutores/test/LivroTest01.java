package academy.devedojo.maratonajava.javacore.Dconstrutores.test;

import academy.devedojo.maratonajava.javacore.Dconstrutores.domain.Livro;

public class LivroTest01 {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Java Para Iniciantes", "João Silva", 49.90, 2023);
        Livro livro2 = new Livro("Python para Todos", "Maria Souza");

        livro1.exibirDetalhes();
        System.out.println("---------------");
        livro2.exibirDetalhes();
    }
}
