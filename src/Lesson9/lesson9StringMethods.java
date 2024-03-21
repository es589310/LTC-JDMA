package Lesson9;

import java.util.Arrays;

public class lesson9StringMethods {
    public static void main(String[] args) {
        String word = "Hello World";
//        System.out.println(word.length()); //11
//        System.out.println(word.substring(4, 8)); // o Wo
//        System.out.println(word.substring(6)); // World

//        System.out.println(word.split(" ")); //[Ljava.lang.String;@a09ee92
//        String[] words =  word.split(" "); // bu string array verir
//        System.out.println(Arrays.toString(words)); //[Hello, World] boshlugha gore boldu

//        char l = word.charAt(2); // 2ci indeksde nedirse onu qaytarir
//        int i = word.indexOf('l'); //birinci l-i indeks olaraq goturur
//        int i1 = word.lastIndexOf('l'); //ikinci l-i indeks olaraq goturur
//        System.out.println(i);
//        System.out.println(i1);

        String replace = word.replace("H", "T");
        System.out.println(replace); //Tello World


    }

}
