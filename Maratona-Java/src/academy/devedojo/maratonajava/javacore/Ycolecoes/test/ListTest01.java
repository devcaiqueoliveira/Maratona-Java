package academy.devedojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> names2 = new ArrayList<>();
        names.add("William");
        names.add("DevDojo");
        names2.add("Suane");
        names2.add("Academy");

        names.addAll(names2);

        for (String name: names) {
            System.out.println(name);
        }

        System.out.println("----------");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        ArrayList<Integer> numeros = new ArrayList<>();
    }
}