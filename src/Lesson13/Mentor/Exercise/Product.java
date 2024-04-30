package Lesson13.Mentor.Exercise;

public class Product {
    protected String brand;
    protected String model;

    public Product(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }


//    public final void getInfo(){
//    }
    public final void getInfo() {
//        return "Brand: " + brand + ", Model: " + model;
        System.out.println("Marka:" + brand + " " + "Model:" + model );


    }//child classlar burdan override edəbilmir çünki bu metod finaldır


}
