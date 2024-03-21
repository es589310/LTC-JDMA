package Lesson9.EntertainingLevel;

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
