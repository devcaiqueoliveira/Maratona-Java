package academy.devedojo.maratonajava.javacore.Hheranca.dominio;

public class Employee extends Pessoa {

    private double salary;

    public Employee(String name) {
        super(name);
    }

    public void print() {
        super.print();
        System.out.println(salary);
    }

    public void paymentReport() {
        System.out.println("Eu " + this.name + " recebi o salario de " + this.salary);
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
