package academy.devedojo.maratonajava.javacore.Aexercicios.ExercicioDeepSeek2;

public class Aluno {
    private String nome;
    private double nota;

    public Aluno (String nome, double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota inválida! Deve ser entre 0 e 10");
        }
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return this.nome;
    }

    public double getNota() {
        return this.nota;
    }
}