package Lesson14.Teacher.NormalLevel.MathOperationsOverload;

public class MathOperations {
    private int a;
    private double b;
    private int d;
    private double c;

    public void operations(int a, int b){
        System.out.println("Toplama: " + (a + b));
    }
    public void operations(int a, double b){
        System.out.println("Çıxma: " + (a - b));
    }
    public void operations(double c, int d){
        System.out.println("Vurma: " + (c * d));
    }
    public void operations(double c, double d){
        System.out.println("Toplama: " + (c / d));
    }
}
