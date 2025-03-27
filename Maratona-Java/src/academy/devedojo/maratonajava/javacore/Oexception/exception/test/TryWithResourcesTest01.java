package academy.devedojo.maratonajava.javacore.Oexception.exception.test;

import academy.devedojo.maratonajava.javacore.Oexception.exception.domain.Leitor1;
import academy.devedojo.maratonajava.javacore.Oexception.exception.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {
        try (Leitor2 leitor2 = new Leitor2();
             Leitor1 leitor1 = new Leitor1();) {

        } catch (IOException e) {

        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
