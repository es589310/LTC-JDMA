package Lesson11.HomeWork.NormalLevel;
/*
*   Topic: Constructors
    Örnek değişkenlerle "Araba" adında bir Java sınıfı oluşturun
    bir arabanın markası ve modeli için. için bir yapıcı yazın
    bu değişkenleri başlatan "Araba" sınıfı. Yaratmak
    "Araba" sınıfından bir nesne ve onun markasını ve modelini gösterir.
 */
public class Car {
    String brand;
    String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void carDisplay(){

        System.out.println("Marka: " + brand + " | " +"Model: " + model);
    }
    public static void main(StringClass[] args) {
        Car car1 = new Car("Tesla","S");
        Car car2 = new Car("Tesla","Y");
        Car car3 = new Car("Tesla","Track");
        car1.carDisplay();
        car2.carDisplay();
        car3.carDisplay();

    }
}
