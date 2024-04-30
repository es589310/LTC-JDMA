package Lesson9.Teacher.EntertainingLevel;

public class ELBook {
    String title;
    ELAuthor author;
    int publicationYear;

    @Override
    public String toString() {
        return "ELBook{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
