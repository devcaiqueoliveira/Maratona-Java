package academy.devedojo.maratonajava.javacore.MethodsExercise01.domain;

public class Employee {
    public String name;
    public int age;
    public double[] salaries;

    public void print () {
        System.out.println(this.name);
        System.out.println(this.age);
        if (salaries == null) {
            return;
        }
        for (double salary : salaries) {
            System.out.print(salary + " ");
        }

        printSalary();
    }

    public void printSalary () {
        if (salaries == null) {
            return;
        }
        double averageSalary = 0;
        for (double salary: salaries) {
            averageSalary += salary;
        }
        averageSalary /= salaries.length;
        System.out.println("\n" + averageSalary);
    }
}
