package Lesson11;

public class Lesson11{
    String name;
    int age;

    // Constructor with parameters
    public Lesson11(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Lesson11 person1 = new Lesson11("Alice", 25); // Creating an object with a constructor
        person1.displayInfo();
    }
}

