package Lesson9.Teacher.EntertainingLevel;

public class ELLibrary {
    String about;
    ELBook firstBook, secondBook;

    @Override
    public String toString() {
        return "ELLibrary{" +
                "about='" + about + '\'' +
                ", firstBook=" + firstBook +
                ", secondBook=" + secondBook +
                '}';
    }
}
