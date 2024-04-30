package Lesson15.Mentor.Exercises;

public class Bird implements  Flyable,Animal{

    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " ötür!");
    }

    @Override
    public void takeOff() {
        System.out.println(name + " ağacın budağından göyə doğru qalxır."); // Kuşun kalkış yapması
    }

    @Override
    public void land() {
        System.out.println(name + " göydə süzülüb, yerə eniş edir."); // Kuşun iniş yapması
    }
}



