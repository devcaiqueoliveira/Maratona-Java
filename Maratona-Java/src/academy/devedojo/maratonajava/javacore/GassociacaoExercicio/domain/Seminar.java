package academy.devedojo.maratonajava.javacore.GassociacaoExercicio.domain;

public class Seminar {
    private String title;
    private Student[] student;
    private Local localSeminar;

    public Seminar(String title, Local localSeminar) {
        this.title = title;
        this.localSeminar = localSeminar;
    }

    public Seminar(String title, Student[] student, Local localSeminar) {
        this.title = title;
        this.student = student;
        this.localSeminar = localSeminar;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public Local getLocalSeminar() {
        return localSeminar;
    }

    public void setLocalSeminar(Local localSeminar) {
        this.localSeminar = localSeminar;
    }
}
