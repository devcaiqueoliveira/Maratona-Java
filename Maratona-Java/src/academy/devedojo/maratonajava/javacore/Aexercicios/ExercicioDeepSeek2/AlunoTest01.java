package academy.devedojo.maratonajava.javacore.Aexercicios.ExercicioDeepSeek2;

import java.util.Scanner;

public class AlunoTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos deseja cadastrar? ");
        int n = sc.nextInt();

        if (n <= 0 ) {
            throw new IllegalArgumentException("Numero de alunos deve ser maior do que zero");
        }

        Aluno[] alunos = new Aluno[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Cadastro do Aluno " + (i + 1) +  " ---");
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Nota: ");
            double nota = sc.nextDouble();

            alunos[i] = new Aluno(nome, nota);
        }

        double soma = 0;
        for (Aluno aluno : alunos) {
            soma += aluno.getNota();
        }
        double media = soma / alunos.length;
        System.out.println("Média da turma: " + media);

        System.out.println("\nAlunos acima da média:");
        for (Aluno aluno : alunos) {
            if (aluno.getNota() > media) {
                System.out.println(aluno.getNome() + " (" + aluno.getNota() + ")");
            }
        }

        sc.close();
    }
}
