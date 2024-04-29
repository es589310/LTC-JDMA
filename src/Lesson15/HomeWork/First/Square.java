package Lesson15.HomeWork.First;

public class Square extends Shape{
    double width;
    double height;

    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double area = (int)(width * height);
        return area;
    }
}
