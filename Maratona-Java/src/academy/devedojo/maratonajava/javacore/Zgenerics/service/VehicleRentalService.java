package academy.devedojo.maratonajava.javacore.Zgenerics.service;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class VehicleRentalService<T> {
    private List<T> veiculosDisponiveis;

    public T buscarVeiculoDisponivel() {
        System.out.println("Buscando veiculo disponivel...");
        T t = veiculosDisponiveis.remove(0);
        System.out.println("Alugando veiculo: " + t);
        System.out.println("Veiculos disponiveis para alugar: ");
        System.out.println(veiculosDisponiveis);
        return t;
    }

    public void retornarVeiculoAlugado(T t) {
        System.out.println("Devolvendo veiculo " + t);
        veiculosDisponiveis.add(t);
        System.out.println("Veiculos disponiveis para alugar: ");
        System.out.println(veiculosDisponiveis);
    }
}
