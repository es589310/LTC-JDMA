package Lesson15.Teacher.HomeWork.Third;

public class Person implements Swim,Walk{
    @Override
    public void swim() {
        System.out.println("Mən üzürəm");
    }

    @Override
    public void walk() {
        System.out.println("Mən gəzirəm");
    }
}
