package academy.devedojo.maratonajava.javacore.GassociacaoExercicio.domain;

public class Professor {
    private String name;
    private String specialty;
    private Seminar[] seminars;

    public Professor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public Professor(String name, String specialty, Seminar[] seminars) {
        this.name = name;
        this.specialty = specialty;
        this.seminars = seminars;
    }

    public void print() {
        System.out.println("-------");
        System.out.println("Professor: " + this.name);
        System.out.println();
        if (this.seminars == null) return;
        System.out.println("## Seminarios Cadastrados ##");
        for (Seminar seminar : seminars) {
            System.out.println(seminar.getTitle());
            System.out.println(seminar.getLocalSeminar().getAddress());
            System.out.println();
            if (seminar.getStudent() == null || seminar.getStudent().length == 0) continue;
            System.out.println("** Alunos **");
            for (Student student : seminar.getStudent()) {
                System.out.println("Aluno: " + student.getName());
                System.out.println("Idade: " + student.getAge());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
