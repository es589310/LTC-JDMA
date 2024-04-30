package Lesson12.Teacher.EntertainingLevel;

public class LibraryBook {
    private String title;
    private String author;
    private int yearPublished;
    private boolean checkedOut;

    public LibraryBook(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public void checkOut() {
        if (!checkedOut) {
            System.out.println("Kitabımı oxumaq üçün verdim.");
        } else {
            System.out.println("Kitab rəfdədir");
        }
    }

    public void returnBook() {
        checkedOut = true;
        System.out.println("Kitabım geri qaytarıldı.");
    }

//    public boolean isAvailable() {
//        return !checkedOut;
//    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public static void displayBookInfo(LibraryBook book) {
        System.out.println("Kitabın adı: " + book.getTitle());
        System.out.println("Yazar: " + book.getAuthor());
        System.out.println("Yayınlanma ili: " + book.getYearPublished());
        System.out.println("Kitab rəfdədirmi?: " + (!book.checkedOut ? "Bəli" : "Xeyr"));
    }

}
