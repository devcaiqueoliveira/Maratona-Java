package academy.devedojo.maratonajava.javacore.GassociacaoExercicio.test;

import academy.devedojo.maratonajava.javacore.GassociacaoExercicio.domain.Local;
import academy.devedojo.maratonajava.javacore.GassociacaoExercicio.domain.Professor;
import academy.devedojo.maratonajava.javacore.GassociacaoExercicio.domain.Seminar;
import academy.devedojo.maratonajava.javacore.GassociacaoExercicio.domain.Student;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua Manoel Vilaboim");
        Student student = new Student("Caique", 21);
        Professor professor = new Professor("Ramon", "Física");
        Student[] studentsForSeminars = {student};

        Seminar seminar = new Seminar("Como passar em física", studentsForSeminars, local);

        Seminar[] availableSeminars = {seminar};

        professor.setSeminars(availableSeminars);

        professor.print();
    }
}