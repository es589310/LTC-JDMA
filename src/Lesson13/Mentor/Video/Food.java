package Lesson13.Mentor.Video;

public class Food {
    private String name;
    private double price;

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void printDetails(){
        System.out.println(name + " " + price);
    }

}
