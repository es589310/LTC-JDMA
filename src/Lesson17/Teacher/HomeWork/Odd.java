package Lesson17.Teacher.HomeWork;

public class Odd extends Thread{

    private final Object lock;

    public Odd(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            for (int i = 1; i <= 100; i+=2) {
                lock.notify(); //notify multithreading-dir(çoxlu iş götürən), run olmalı wait-i oyandırmaq üçün istifadə olunur
                System.out.println(i + " tək");
                try {
                    lock.wait(500);
                } catch (InterruptedException a) {
                    a.printStackTrace();
                }
            }
        }
    }
}
