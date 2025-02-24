    package academy.devedojo.maratonajava.javacore.Dconstrutores.domain;

    public class Livro {

        private String titulo, autor;
        private double preco;
        private  int anoDePublicacao;

        public Livro (String titulo, String autor, double preco, int anoDePublicacao) {
            this.titulo = titulo;
            this. autor = autor;
            this.preco = preco;
            this.anoDePublicacao = anoDePublicacao;
        }

        public Livro (String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
            this.preco = 30.0;
            this.anoDePublicacao = 2020;
        }

        public void exibirDetalhes() {
            System.out.println("Titulo: " + this.titulo);
            System.out.println("Autor: " + this.autor);
            System.out.printf("Preco: %.2f%n", this.preco);
            System.out.println("Ano de Publicacao: " + this.anoDePublicacao);
        }
    }
