package javacore.Bintroductionmethods.domain;

import java.util.Scanner;

public class Calculator {
    Scanner sc = new Scanner(System.in);

    public int x, y;
    public void inputNumbers () {
        x = sc.nextInt();
        y = sc.nextInt();
    }
    public void sumTwoNumbers () {
        System.out.println(x+y);
    }
}
