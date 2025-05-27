package academy.devedojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String name;
    private double price;

    public Manga(Long id, String name, double price) {
        Objects.requireNonNull(id, "Id não pode ser null");
        Objects.requireNonNull(name, "Nome não pode ser null");
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Double.compare(price, manga.price) == 0 && Objects.equals(id, manga.id) && Objects.equals(name, manga.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Manga anotherManga) {
        // negativo se o this < outroManga
        // se this == outroManga, return 0
        // postivo se o this > outroManga
//        if (this.id < outroManga.getId()) {
//            return -1;
//        } if (this.id.equals(outroManga.getId())) {
//            return 0;
//        } else {
//            return 1;
//        }
        // return this.nome.compareTo(anotherManga.getName());
        // return Double.compare(price, anotherManga.getPrice());
        // return Double.valueOf(price).compareTo(anotherManga.getPrice());
        return this.id.compareTo(anotherManga.getId());
    }
}