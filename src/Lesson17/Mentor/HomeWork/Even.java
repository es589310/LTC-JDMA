package Lesson17.Mentor.HomeWork;

public class Even extends Thread{
    private final Object lock;

    public Even(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 2; i <= 10; i = i + 2) {
                lock.notify();
                System.out.println(i + " cüt");
                try {
                    lock.wait(300);
                } catch (InterruptedException a) {
                    a.printStackTrace();
                }
            }
        }
    }
}
