package Lesson9.Teacher.EntertainingLevel;

public class ELMain {
    public static void main(String[] args) {
        ELAuthor first = new ELAuthor();
        first.name = "Əli Xəyyam";
        first.birthYear = "24.02.1989";

        ELAuthor second = new ELAuthor();
        second.name = "Lev Ivanoviç Tolstoy";
        second.birthYear = "09.09.1828";


        ELBook firstbook = new ELBook();
        firstbook.title = "Bulud Bağçaları";
        firstbook.publicationYear = 2016;
        firstbook.author = first;

        ELBook secondBook = new ELBook();
        secondBook.title = "İvan İlyiçin Ölümü";
        secondBook.publicationYear = 1886;
        secondBook.author = second;

        ELLibrary library = new ELLibrary();
        library.about = "Bədii Ədəbiyyat \n";

        library.firstBook = firstbook;
        library.secondBook = secondBook;

        System.out.print(library);



    }
}
