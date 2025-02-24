package academy.devedojo.maratonajava.javacore.Dconstrutores.domain;

public class Anime {
    private String name, genero, tipo;
    private int epsodios;

    public Anime(String name, String genero, String tipo, int epsodios) {
        this.name = name;
        this.genero = genero;
        this.tipo = tipo;
        this.epsodios = epsodios;
    }

    public void printar() {
        System.out.println(toString());
    }
}
