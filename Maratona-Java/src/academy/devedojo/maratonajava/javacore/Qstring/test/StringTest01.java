package academy.devedojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {

        //Strings sao imutaveis e sao criadas na String pool constant

        String nome = "William";
        String nome2 = "William";

        // nome.concat(" Suane"); - não vai funcionar como o esperado
        nome = nome.concat(" Suane");

        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("William");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
