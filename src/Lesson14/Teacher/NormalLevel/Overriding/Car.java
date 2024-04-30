package Lesson14.Teacher.NormalLevel.Overriding;

public class Car extends Vehicle{
    @Override
    public void start() {
        super.start();
        System.out.println("Avtomobil sürətli və perspektivlidir.");
    }
}
