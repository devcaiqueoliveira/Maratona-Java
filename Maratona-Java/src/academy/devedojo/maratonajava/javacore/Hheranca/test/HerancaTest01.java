package academy.devedojo.maratonajava.javacore.Hheranca.test;

import academy.devedojo.maratonajava.javacore.Hheranca.dominio.Address;
import academy.devedojo.maratonajava.javacore.Hheranca.dominio.Employee;
import academy.devedojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

import java.util.EnumMap;

public class HerancaTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Rua Manoel Vilaboim");
        address.setZipCode("44380-000");
        Pessoa pessoa = new Pessoa("Pessoa");
        pessoa.setName("Caique");
        pessoa.setSsn("32323232");
        pessoa.setAddress(address);

        pessoa.print();

        Employee employee = new Employee("Funcionario");
        employee.setName("Kaique Matheus");
        employee.setSsn("12121212");
        employee.setAddress(address);
        employee.setSalary(20000);

        System.out.println("----------------------");
        employee.print();
    }
}
