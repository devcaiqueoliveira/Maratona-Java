package academy.devedojo.maratonajava.javacore.Ycolecoes.test;

import academy.devedojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Attack on titan", 19.9));
        mangas.add(new Manga(1L,"Berserk", 9.5));
        mangas.add(new Manga(4L,"Hellsing Ultimate", 3.2));
        mangas.add(new Manga(3L,"Pokemon", 11.20));
        mangas.add(new Manga(2L,"Dragon Ball Z", 2.99));
        System.out.println(mangas);

        Collections.sort(mangas);
        System.out.println("--------------");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}