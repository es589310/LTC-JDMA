package Lesson17.Mentor.HomeWork;

public class Main {
    private static final Object lock = new Object();
    public static void main(String[] args) {
        Even even = new Even(lock);
        Odd add = new Odd(lock);

        //Task1
        even.setPriority(9);
        add.start();
        even.start();


        //Task2
//        add.start();
//        try {
//            add.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        even.start();
    }
}
