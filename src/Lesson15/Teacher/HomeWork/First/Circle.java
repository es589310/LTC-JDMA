package Lesson15.Teacher.HomeWork.First;

public class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = (int)(Math.PI * radius * radius);
        return area;
    }

}
