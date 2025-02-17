package academy.devedojo.maratonajava;

import java.util.Scanner;

public class aulaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* for (int i = 1; i < 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
         */

        int x = sc.nextInt();
        int n = x - 25;

        for (int i = x - 25; i < x; i++) {
            System.out.println(i);
        }

    }
}