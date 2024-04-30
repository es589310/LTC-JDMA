package Lesson15.Mentor.Video;

public class Cat implements AnimaAbstract {
    private double weight;

    public Cat(double weight) {
        this.weight = weight;
    }

    @Override
    public void wals(String speed) {
        System.out.println("Cat is walking" );
    }
}
