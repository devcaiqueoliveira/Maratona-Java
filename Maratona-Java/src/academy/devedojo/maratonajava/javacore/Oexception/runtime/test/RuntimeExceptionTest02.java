package academy.devedojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1,0);
        System.out.println("teste");
    }
    public static int divisao(int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException("Não pode ser 0");
        }
        return a/b;

        /* try {
            return a/b;
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return 0; */

    }
}
