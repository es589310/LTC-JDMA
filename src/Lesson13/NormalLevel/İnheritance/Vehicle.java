package Lesson13.NormalLevel.İnheritance;

public class Vehicle {
    String make;
    String model;


    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void test(){
        System.out.println(model + " " + make + "dan hazırlanıb.");
    }

}
