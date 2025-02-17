package javacore.Aintroductionclasses.test;

import javacore.Aintroductionclasses.domain.Car;

public class Car01 {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Camaro";
        car.model = "88";
        car.year = 1988;

        System.out.println(car.name + " " + car.model + " " + car.year);
    }

}
