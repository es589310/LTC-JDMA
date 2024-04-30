package Lesson15.Mentor.HomeWork;

public class GrocerShopping {
    public static void main(String[] args) {
        Dairy diary = new Dairy();
        FreshProduce freshProduce = new FreshProduce();
        Meet meat = new Meet();


        Product[] products = new Product[3];
        products[0] = meat;
        products[1] = freshProduce;
        products[2] = diary;
        double kassa = diary.getCost() + meat.getCost() + freshProduce.getCost();
        System.out.println("Məhsulların ümumi qiyməti: " + kassa + " azn.");
        System.out.println(" ---------------------------- ");
        System.out.println("Çekdə çap olunanlar:  ");
        for (Product i : products){
            System.out.println(i);
        }
    }
}
