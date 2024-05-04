package Lesson19.Teacher.Video;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Mercedes";
        car.price = 30000;
        car.currencyType = CurrencyType.EURO; //bu sayədə istifadəçi bunu dəyişə bilməyəcək

        String name = CurrencyType.AZN.name();
        System.out.println(name); //AZN
        //burda niye ferqli chagirir
        String type = CurrencyType.EURO.getValue();
        System.out.println(type); //Avro

    }
}
