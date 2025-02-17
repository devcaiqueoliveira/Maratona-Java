package academy.devedojo.maratonajava;

public class aulaOperadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("Dez é maior do que vinte? " + isDezMaiorQueVinte);
        System.out.println("Dez é menor do que vinte? " + isDezMenorQueVinte);


        System.out.println("Dez é igual vinte? " + isDezIgualVinte);
        System.out.println("Dez é igual dez? " + isDezIgualDez);    
        System.out.println("Dez é diferente de dez? " + isDezDiferenteDez);
    }
}
