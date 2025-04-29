package academy.devedojo.maratonajava.javacore.Aexercicios.ExercicioDeepSeek1;

public class Produto {
    protected String nome;
    protected double preco;

    // Construtor com validação de preço
    public Produto (String nome, double preco) {
        if (preco < 0) {
            throw new ArithmeticException("Preco nao pode ser negativo!");
        }
        this.nome = nome;
        this.preco = preco;

    }

    // Metodo para aplicar desconto
    public void aplicarDesconto(double percentual) {
        if (percentual < 0) {
            throw new ArithmeticException("Percentual inválido! Deve ser entre 0 e 100.");
        } if (percentual > 100) {
            throw new IllegalArgumentException("Desconto maior 100% não existe!");
        }
        this.preco -= (this.preco * (percentual * 0.01));
    }

    // Getters (necessários para acessar os atributos)
    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }
}