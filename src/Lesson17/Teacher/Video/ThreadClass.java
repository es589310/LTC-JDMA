package Lesson17.Teacher.Video;

public class ThreadClass extends Thread{
    private String threadName;

    public ThreadClass(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(threadName + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
