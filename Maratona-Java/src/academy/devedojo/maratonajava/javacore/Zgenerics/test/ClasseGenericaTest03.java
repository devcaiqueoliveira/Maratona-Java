package academy.devedojo.maratonajava.javacore.Zgenerics.test;

import academy.devedojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devedojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devedojo.maratonajava.javacore.Zgenerics.service.VehicleRentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> availableCars = new ArrayList<>(
                List.of(
                        new Carro("BMW"),
                        new Carro("Mercedes")
                ));
        List<Barco> availableBoats = new ArrayList<>(
                List.of(
                        new Barco("Canoa"),
                        new Barco("Lancha")
                ));

        VehicleRentalService<Carro> vehicleRentalServiceCar = new VehicleRentalService<>(availableCars);
        Carro car = vehicleRentalServiceCar.buscarVeiculoDisponivel();
        System.out.println("Usando o carro por um mês...");
        vehicleRentalServiceCar.retornarVeiculoAlugado(car);

        System.out.println("----------------");

        VehicleRentalService<Barco> vehicleRentalServiceBoat = new VehicleRentalService<>(availableBoats);
        Barco boat = vehicleRentalServiceBoat.buscarVeiculoDisponivel();
        System.out.println("Usando o barco por um mês...");
        vehicleRentalServiceBoat.retornarVeiculoAlugado(boat);

    }
}
