package Lesson20.Teacher.HomeWork;

import java.util.ArrayList;
import java.util.Scanner;

import static Lesson20.Teacher.Video.GenericsBoxMain.readArray;

public class Fruits {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Alma");
        fruits.add("Armud");
        fruits.add("Banan");

        for (String fruit : fruits){
            System.out.println(fruit);
        }

        //--------------------------------------------------

        String[] fruits1 = {"Gilas","Fındıq","Avokado"};
        readArray(fruits1);
    }
    public static <F> void readArray(F[] array) {

        for (F fruit : array){
            System.out.println(fruit);
        }

    }
}
