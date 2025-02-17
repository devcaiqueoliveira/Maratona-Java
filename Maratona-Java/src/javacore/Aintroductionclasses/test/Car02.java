package javacore.Aintroductionclasses.test;

import javacore.Aintroductionclasses.domain.Car;

public class Car02 {
    public static void main(String[] args) {
        Car car02 = new Car();
        car02.name = "Ferrari";
        car02.model = "La ferrari";
        car02.year = 2025;

        System.out.println(car02.name + " " + car02.model + " " + car02.year);
    }
}
