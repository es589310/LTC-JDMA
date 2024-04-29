package Lesson15Mentor.Exercises;

public class Plane implements Flyable,Transport{
     int capacity;
     String destination;

    public Plane(int capacity) {
        this.capacity = capacity;
        this.destination = "";
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public String getDestination() {
        return destination;
    }

    @Override
    public void setDestination(String destination) {
        this.destination = destination;
        System.out.println(destination + "a doğru uçuşa hazırlıq");
    }

    @Override
    public void takeOff() {
        System.out.println("Təyyarə " + destination + "a uçur."); // Uçağın iniş yapması
    }

    @Override
    public void land() {
        System.out.println("Təyyarə " + destination + " Hava Limanına eniş edir."); // Uçağın iniş yapması
    }
}



