package academy.devedojo.maratonajava.javacore.Aintroductionclasses.test;

import academy.devedojo.maratonajava.javacore.Aintroductionclasses.domain.Car;

public class Car01 {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Camaro";
        car.model = "88";
        car.year = 1988;

        Car car02 = new Car();
        car02.name = "Ferrari";
        car02.model = "La ferrari";
        car02.year = 2025;
        System.out.println("Car 1: ");
        System.out.println(car.name + " " + car.model + " " + car.year);

        System.out.println();
        System.out.println("Car 2: ");
        System.out.println(car02.name + " " + car02.model + " " + car02.year);

    }

}
