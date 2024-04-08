package Lesson13Mentor.Exercise;

public class CPU extends Product {
    private int cores;
    private double clockSpeed;

    public int getCores() {
        return cores;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public CPU(String brand, String model, int cores, double clockSpeed) {
        super(brand, model);
        this.cores = cores;
        this.clockSpeed = clockSpeed;

    }

    public void process(){
        System.out.println("CPU versiyası: i" + getCores() + " - Sürəti: " + getClockSpeed() + " Ghz");
    }

//    public CPU(String brand, String model) {
//        super(brand, model);
//    }
}
