package Lesson13Mentor.RecordType;

public class Main {
    public static void main(String[] args) {

        Record fruit1 = new Record("Apple","red");
        Record fruit2 = new Record("Banana","yellow");
        Record fruit3 = new Record("Pear","green");

        System.out.println(fruit1.name());
//        fruit1.setColor("Yellow");  //record tipdə set metodu yoxdur
        System.out.println(fruit1); //toString cavab qaytarır
    }
}
