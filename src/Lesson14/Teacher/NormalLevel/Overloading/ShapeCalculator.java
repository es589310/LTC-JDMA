package Lesson14.Teacher.NormalLevel.Overloading;

public class ShapeCalculator {
    private int length;
    private int width;
    private double radius1;
    private double base;
    private double height;

    //triangle
    public void calculateFigure(double base, double height){
        System.out.println("Üçbucağın sahəsi: " + (int)(0.5 * base * height));
    }

    //circle
    public void calculateFigure(double radius){
        System.out.println("Dairənin sahəsi: " + (int)(Math.PI * radius * radius));
    }

    //rectangle
    public void calculateFigure(int length, int width){
        System.out.println("Düzbucaqlının sahəsi: " + length * width);
    }

}
