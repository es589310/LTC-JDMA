package Lesson17.Teacher.Video;

public class Main {
    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass("first");
        ThreadClass threadClass1 = new ThreadClass("second");
        ThreadClass threadClass2 = new ThreadClass("third");
        threadClass1.start();
        threadClass.start();
        threadClass2.start();
    }
}
