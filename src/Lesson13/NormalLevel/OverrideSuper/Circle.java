package Lesson13.NormalLevel.OverrideSuper;

public class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
//        super.calculateArea();
        double area = (int)(Math.PI) * radius * radius;
        System.out.println("Dairənin sahəsi: " + area + " sm/kvadrat");
    }
}
