package Lesson9.EntertainingLevel;

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
