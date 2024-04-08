package Lesson12.EntertainingLevel;

import static Lesson12.EntertainingLevel.LibraryBook.displayBookInfo;

public class LibraryTest {
    public static void main(String[] args) {
        System.out.println("Kitabxanamda olan və verdiyim kitablar");
        LibraryBook book1 = new LibraryBook("Başsız Atlı","Mayne Reid",1865);
        LibraryBook book2 = new LibraryBook("Martin Eden","Jack London",1909);
        LibraryBook book3 = new LibraryBook("Satranç","Stefan Zwaig",1943);
        LibraryBook book4 = new LibraryBook("Müptezeller","Emrah Serbes",2015);
        LibraryBook book5 = new LibraryBook("Erken Kaybedenler","Emrah Serbes",2014);
        LibraryBook book6 = new LibraryBook("Son Paragraf","Osman Zahid Yıldız",2017);
        LibraryBook book7 = new LibraryBook("Niyə Susursan Polkovnik?","Elxan Elatlı",1909);
        LibraryBook book8 = new LibraryBook("İtmiş Qızın Axtarışı","Elxan Elatlı",1909);

        displayBookInfo(book1);
        book1.checkOut();
        book1.returnBook();
        System.out.println("__________________");
        displayBookInfo(book1);
        System.out.println("//////////////");

        displayBookInfo(book2);
        System.out.println("//////////////");

        displayBookInfo(book3);
        System.out.println("//////////////");

        displayBookInfo(book4);
        book4.checkOut();
        book4.returnBook();
        System.out.println("__________________");
        displayBookInfo(book4);
        System.out.println("//////////////");

        displayBookInfo(book5);
        System.out.println("//////////////");

        displayBookInfo(book6);
        System.out.println("//////////////");

        displayBookInfo(book7);
        System.out.println("//////////////");

        displayBookInfo(book8);


    }
}
