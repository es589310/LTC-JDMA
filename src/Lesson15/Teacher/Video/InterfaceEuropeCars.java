package Lesson15.Teacher.Video;

public class InterfaceEuropeCars implements İnterfaceVehicle, İnterfaceMotorcycle,Truckİnterface {

    @Override
    public double odoHesabla(double odo) {
        return odo / 1.609;

    }

    @Override
    public void startStop() {
        //
    }
}
