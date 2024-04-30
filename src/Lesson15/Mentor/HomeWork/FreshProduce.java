package Lesson15.Mentor.HomeWork;

public class FreshProduce implements Product{
    //Fresh Produce = təzə məhsul

    final double fruitJuicePrice = 2.5;
    @Override
    public double getUnitPrice() {
        System.out.println("Qarışıq meyvə suyunun qiyməti: " + fruitJuicePrice + " azn.");
        return fruitJuicePrice;
    }

    @Override
    public double getAmount(double quantity) {
        System.out.println("Neçə ədəd meyvə suyu alınıb? " + quantity);
        return quantity;
    }

    @Override
    public double getCost() {
        double juiceCost = getUnitPrice() * getAmount(4);
        System.out.println("Meyvə suyunun toplam qiyməti: " + juiceCost + " azn.");
        return juiceCost;
    }


}
