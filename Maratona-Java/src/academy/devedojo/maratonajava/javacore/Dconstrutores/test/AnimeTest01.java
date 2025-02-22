package academy.devedojo.maratonajava.javacore.Dconstrutores.test;

public class AnimeTest01 {

    private String name, genero, tipo;
    private int epsodios;

    public AnimeTest01 (String name, String genero, String tipo, int epsodios) {
        this.name = name;
        this.genero = genero;
        this.tipo = tipo;
        this.epsodios = epsodios;
    }
    public void printar() {
        System.out.println(toString());
    }
}
