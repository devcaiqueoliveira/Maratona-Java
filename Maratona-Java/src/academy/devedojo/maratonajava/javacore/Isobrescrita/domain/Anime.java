package academy.devedojo.maratonajava.javacore.Isobrescrita.domain;

public class Anime {
    private String name;

    public Anime(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Anime: " + this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
