package Lesson15.HomeWork.Third;

public class Duck implements Swim,Fly,Walk{
    @Override
    public void fly() {
        System.out.println("Ördəklər uçur.");

    }

    @Override
    public void swim() {
        System.out.println("Ördəklər üzür.");

    }

    @Override
    public void walk() {
        System.out.println("Ördəklər gəzir.");

    }
}
