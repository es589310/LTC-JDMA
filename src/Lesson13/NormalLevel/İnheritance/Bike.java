package Lesson13.NormalLevel.İnheritance;

public class Bike extends Vehicle{
    int numWheels;

    public Bike(String make, String model,int numWheels) {
        super(make, model);
        this.numWheels = numWheels;
    }
    public void bikeTest(){
        System.out.println(make + " istehsalı olan " + model + " model velosipedlər " + numWheels + " təkərlidir.");
    }
}
