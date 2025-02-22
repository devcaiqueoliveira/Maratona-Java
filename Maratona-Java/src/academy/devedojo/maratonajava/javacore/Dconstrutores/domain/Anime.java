package academy.devedojo.maratonajava.javacore.Dconstrutores.domain;

import academy.devedojo.maratonajava.javacore.Dconstrutores.test.AnimeTest01;

public class Anime {
    public static void main(String[] args) {
        AnimeTest01 anime = new AnimeTest01("One Piece", "Ação", "TV", 12);
        anime.printar();
    }
}
