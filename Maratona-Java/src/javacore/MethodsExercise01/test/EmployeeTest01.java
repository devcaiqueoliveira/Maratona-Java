package javacore.MethodsExercise01.test;

import javacore.MethodsExercise01.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Caique";
        employee.age = 21;
        employee.salaries = new double[] {987.90, 2000, 1250.98};

        employee.print();
        employee.printSalary();
    }
}
