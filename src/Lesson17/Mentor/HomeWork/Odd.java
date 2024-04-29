package Lesson17.Mentor.HomeWork;

public class Odd extends Thread{
    private final Object lock;

    public Odd(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 1; i <= 10; i = i + 2) {
                lock.notify();
                System.out.println(i + " tək");
                try {
                    lock.wait(300);
                } catch (InterruptedException a) {
                    a.printStackTrace();
                }
            }
        }
    }
}
