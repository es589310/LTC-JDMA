package Lesson15.Video;

public class AmericanCars extends Vehicle{

    @Override
    public double calculateOdo(double odo) {
        return odo / 1.609;
    }

    @Override
    public void info() {
        super.info();
    }//override tələb etmədi özüm yazdım,
    // başqa yoluda main classında bu bala classdan info metodunu çağıra biləcəyimizdi
}
