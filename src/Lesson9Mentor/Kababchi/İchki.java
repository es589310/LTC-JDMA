package Lesson9Mentor.Kababchi;

public class İchki {
    String name;
    double price;

    public İchki(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "İchki{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
