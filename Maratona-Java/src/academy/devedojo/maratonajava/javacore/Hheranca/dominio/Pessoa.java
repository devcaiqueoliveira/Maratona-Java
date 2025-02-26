package academy.devedojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa extends Object {
    protected String name;
    protected String ssn;
    protected Address address;

    public Pessoa(String name) {
        this.name = name;
    }

    public Pessoa(String name, String ssn, Address address) {
        this(name);
        this.ssn = ssn;
        this.address = address;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.ssn);
        System.out.println(this.address.getStreet() + " " + this.address.getZipCode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

