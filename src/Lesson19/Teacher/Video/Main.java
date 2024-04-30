package Lesson19.Teacher.Video;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Mercedes";
        car.price = 30000;
        car.currencyType = CurrencyType.EURO; //bu sayədə istifadəçi bunu dəyişə bilməyəcək

        String type = CurrencyType.AZN.getValue();
        System.out.println(type);

    }
}
