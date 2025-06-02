package academy.devedojo.maratonajava.javacore.Ycolecoes.test;

import academy.devedojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "Attack on titan", 19.9, 0));
        mangas.add(new Manga(1L,"Berserk", 9.5, 5));
        mangas.add(new Manga(4L,"Hellsing Ultimate", 3.2, 0));
        mangas.add(new Manga(3L,"Pokemon", 11.20, 2));
        mangas.add(new Manga(2L,"Dragon Ball Z", 2.99, 0));

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
