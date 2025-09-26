package academy.devedojo.maratonajava.javacore.Zgenerics.test;

import academy.devedojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = retornarArrayComUmObjeto(new Barco("Canoa Marota"));
        System.out.println(barcoList);
    }

    public static <T> List<T> retornarArrayComUmObjeto(T t) {
        return List.of(t);
    }
}
