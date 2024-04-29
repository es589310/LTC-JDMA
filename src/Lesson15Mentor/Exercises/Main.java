package Lesson15Mentor.Exercises;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Sərçə");
        bird.makeSound();
        bird.takeOff();
        bird.land();

        System.out.println("------------------------------------------------");

        Plane plane = new Plane(150);
        plane.setDestination("Istanbul");
        plane.takeOff();
        plane.land();
    }
}
