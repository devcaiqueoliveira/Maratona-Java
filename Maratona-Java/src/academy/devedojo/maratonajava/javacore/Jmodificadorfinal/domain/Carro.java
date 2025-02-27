package academy.devedojo.maratonajava.javacore.Jmodificadorfinal.domain;

public class Carro {

    private String name;
    public static final double MAX_SPEED = 250;
    private final Comprador COMPRADOR = new Comprador();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}