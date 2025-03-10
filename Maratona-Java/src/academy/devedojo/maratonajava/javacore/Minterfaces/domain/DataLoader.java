package academy.devedojo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    public abstract void load();

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }
}
