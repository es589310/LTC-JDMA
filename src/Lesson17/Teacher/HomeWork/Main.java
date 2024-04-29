package Lesson17.Teacher.HomeWork;

public class Main {
    private static final Object lock = new Object();
    public static void main(String[] args) {
        Odd odd = new Odd(lock);
        Even even = new Even(lock);

        odd.start();
        even.start();
    }
}
