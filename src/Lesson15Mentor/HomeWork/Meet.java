package Lesson15Mentor.HomeWork;

public class Meet implements Product{

    final double kqMeat = 15;
    @Override
    public double getUnitPrice() {
        System.out.println("Ətin qiyməti: " + kqMeat + "azn.");
        return kqMeat;
    }

    @Override
    public double getAmount(double quantity) {
        System.out.println("Neçə kq. ət alınıb" + quantity);
        return quantity;
    }

    @Override
    public double getCost() {
        double costMeet = getUnitPrice() * getAmount(5);
        System.out.println("Ətin ümumi qiyməti: " + costMeet + " azn.");
        return costMeet;
    }

}
