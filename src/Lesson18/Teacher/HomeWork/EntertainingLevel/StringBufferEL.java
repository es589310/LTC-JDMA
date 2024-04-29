package Lesson18.Teacher.HomeWork.EntertainingLevel;

public class StringBufferEL extends Thread {
    private StringBuffer bufer;
    private String text;

    public StringBufferEL(StringBuffer bufer, String text) {
        this.bufer = bufer;
        this.text = text;
    }

    @Override
    public void run() {
        bufer.append(text);
    }


    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBufferEL t1 = new StringBufferEL(stringBuffer,"Hello ");
        StringBufferEL t2 = new StringBufferEL(stringBuffer,"World ");
        StringBufferEL t3 = new StringBufferEL(stringBuffer," !!!");
        StringBufferEL t4 = new StringBufferEL(stringBuffer,"???");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        System.out.println(stringBuffer);



    }

}
