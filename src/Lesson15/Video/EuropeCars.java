package Lesson15.Video;

public class EuropeCars extends Vehicle{

    @Override
    public double calculateOdo(double odo) {
        return odo / 1.609;
    }
}
