package Lesson9.Teacher.Video;

public class lesson9Main {
    public static void main(String[] args) {
        //reference types - array, interface,inum
        //və özümüzün yaratdığımız classlarda reference tipləri olur
        lesson9Wheel micheelin = new lesson9Wheel();
        micheelin.brand = "Michelin";
        micheelin.material = "Rezin";
        micheelin.size = 18;
        String emin;
        int emo;

        lesson9Engine v8 = new lesson9Engine();
        v8.name = "V8";
        v8.horsePower = 500;
        v8.volume = 6000;

        //bunu indi car obyektinə qoşuruq
        lesson9Car schumacerCar = new lesson9Car();
        schumacerCar.make = "Ferrari";
        schumacerCar.model = "F420";
        schumacerCar.year = 2022;
//        schumacerCar.engine = 500; // burda deyirki engine tipinde obyekt ver
        schumacerCar.engine = v8; //artıq bunu digər class-a mənimsətdik
        schumacerCar.wheel = micheelin;

        //xülasə, 1-ci təkərin, sonra motoru obyektini yaratdıq..
        //..car obyektinin daxilində engine və vheeli deyə bildik
        //yəni obyektin içərisində obyekt qurduğ

        System.out.println(schumacerCar); //Lesson9.Teacher.Video.lesson9Car@4a574795 - bunu tam gormek uchun toString istifade edirik
        //bunun üçün əsas class Car-a gedirik (lesson9Car.java)







    }
}
