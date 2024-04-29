package Lesson15.HomeWork.First;

public class ShapeMain {
    public static void main(String[] args) {
        Circle circle = new Circle(4.5);
        System.out.println("Dairənin sahəsi: " + circle.calculateArea());

        Square square = new Square(4.7,4.9);
        System.out.println("Düzbucaqlının sahəsi: " + square.calculateArea());

    }
}
