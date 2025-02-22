package academy.devedojo.maratonajava.javacore.Aintroductionclasses.test;

import academy.devedojo.maratonajava.javacore.Aintroductionclasses.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.age = 21;
        student.gender = 'M';
        student.name = "Luffy";
        System.out.println(student.age);
        System.out.println(student.gender);
        System.out.println(student.name);
    }
}
