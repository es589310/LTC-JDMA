package Lesson13.NormalLevel.İnheritance;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("polad","Maşın");
//        vehicle.test();
        Car car = new Car("VAG Group","Volkswagen",4);
//        car.cartest();
        Bike bike = new Bike("Alman","Peuget",2);
        bike.bikeTest();
    }
}
