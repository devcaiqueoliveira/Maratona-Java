package academy.devedojo.maratonajava.javacore.Gassociacao.test;

import academy.devedojo.maratonajava.javacore.Gassociacao.domain.Escola;
import academy.devedojo.maratonajava.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya Sensei");
        Professor professor1 = new Professor("Kakashi Sensei");
        Professor professor2 = new Professor("Asuma Sensei");
        Professor[] professores = {professor, professor1, professor2};
        Escola escola = new Escola("Montessori", professores);

        escola.imprime();
    }
}
