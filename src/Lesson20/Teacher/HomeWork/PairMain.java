package Lesson20.Teacher.HomeWork;

import Lesson20.Teacher.Video.GenericsBoxMain;

public class PairMain {
    public static void main(String[] args) {
        Pair<String,String> name = new Pair<>("Sahib","Kəmalə");
        System.out.println(name.getFeaturesM() + " və " + name.getFeaturesW() + " nişanlıdırlar.");
        System.out.println("----------------------------------");

        name.setFeaturesM("Natiq");
        name.setFeaturesW("Fəridə");
        System.out.println(name.getFeaturesM() + " və " + name.getFeaturesW() + " evlidir.");

        System.out.println("------------------------------------");
        name.setFeaturesM("Kamil");
        name.setFeaturesW("Tünzalə");
        System.out.println(name.getFeaturesM() + " və " + name.getFeaturesW() + " subaydır, ailə qurmağı düşünürlər.");


    }
}
