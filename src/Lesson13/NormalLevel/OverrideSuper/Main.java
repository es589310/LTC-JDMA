package Lesson13.NormalLevel.OverrideSuper;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
//        shape.calculateArea();

        Circle circle = new Circle(5);
        circle.calculateArea();
        Rectangle rectangle = new Rectangle(8,17);
        rectangle.calculateArea();
    }
}
