package Lesson15.Mentor.HomeWork;

public class Dairy implements Product{
//    public String name;
//    public double productPrice;
//    public double amount;


//    public Dairy(String name, double productPrice, double amount) {
//        this.name = name;
//        this.productPrice = productPrice;
//        this.amount = amount;
//    }

    final double price = 0.25;
    @Override
    public double getUnitPrice() {
        System.out.println("Yumurtanın qiyməti: " + price + "azn.");
        return price;
    }

    @Override
    public double getAmount(double quantity) {
        System.out.println("Neçə yumurta alınıb?" + quantity);
        return quantity;
    }

    @Override
    public double getCost() {
        double costEgg = getUnitPrice() * getAmount(15);
        System.out.println("Yumurtanın toplam qiyməti: " + costEgg );
        return costEgg;
    }

}
