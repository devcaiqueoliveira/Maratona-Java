package academy.devedojo.maratonajava.javacore.Gassociacao.test;

import academy.devedojo.maratonajava.javacore.Gassociacao.domain.Jogador;
import academy.devedojo.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Selecao Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
