package javacore.Aintroductionclasses.test;

import javacore.Aintroductionclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Kami";
        professor.age = 150;
        professor.gender = 'M';
        System.out.println(professor.name + " " + professor.age + " " + professor.gender);
    }
}
