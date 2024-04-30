package Lesson10.Teacher.HomeWork;

public class MemoryDemo {
    public void stackVsheap(){
        int c = 23;
        int e = 10;
        int result = c + e;
        //stack memory
        System.out.println(result);

        double f = 4.2;
        double v = 5.6;
        double resultd = add(f,v);
        System.out.println(resultd);
    }
    public static double add(double s, double a){
        return s + a;
    }

}
