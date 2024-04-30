package Lesson13.Teacher.NormalLevel.İnheritance;

public class Car extends Vehicle{
    int numDoors;

    public Car(String make, String model, int numDoors) {
        super(make, model);
        this.numDoors = numDoors;
    }

    public void cartest(){
        System.out.println(make + " avtomobillərindən olan " + model + " " + numDoors + " qapılıdır.");
    }
}
