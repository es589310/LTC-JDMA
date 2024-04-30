package Lesson9.Mentor.Video;

public class Item {
    String name;
    double price;
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
    @Override
    public String toString() {
        return name + " " + price +"$";
    }
}
/*
- **`Item`** sınıfı, alışveriş listesindeki bir öğeyi temsil eder.
- Alanlar: 'Dize adı'; 'çift fiyat'.
- Sınıf, adı ve fiyatı başlatmak için bir kurucu içerir.
- 'çift getPrice()'
- Öğenin dize gösterimini sağlamak için **`toString()`** yöntemini geçersiz kılın.
 */