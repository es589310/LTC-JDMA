package Lesson14.Teacher.NormalLevel.Overloading;

public class Main {
    public static void main(String[] args) {
        ShapeCalculator count = new ShapeCalculator();
        count.calculateFigure(4);
        count.calculateFigure(4,5);
        count.calculateFigure(4.5,5.2);
    }
}
