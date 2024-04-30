package Lesson13.Mentor.Video;

public class Fruit extends Food{
    private String color;


    public Fruit(String name, double price, String color) {
        super(name, price); // super Food clası=parent class
        this.color = color; // this isə bu class Fruit class = child class
    }

    @Override
    public void printDetails() {
        super.printDetails();
        //əlavə olaraq color ardınca verək
//        System.out.println(this.color);
        //əgər Food daxilində private olan fieldləri istəsəm ordan onları getmethod ilə çağırmalı olacam
        System.out.println(this.getName() + " " + color + " " + this.getPrice() );
//                     hal hazırda fruitin adını çağırsın

    }
}

