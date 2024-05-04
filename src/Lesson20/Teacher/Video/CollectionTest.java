package Lesson20.Teacher.Video;

import java.util.*;

public class CollectionTest {
    //Collection framework-dür

    public static void main(String[] args) {
        //set unicdir
//        Set<Integer> nums = new HashSet<>(); //setin implement oldughu ile hashsetden bashlayaq
//        HashSet<Integer> nums1 = new HashSet<>(); //yuxarıdakinə bənzər bu cürdə yazıla bilir
        //HashSet input dəyər yazırıq, output dəyər çıxarırdı, dəyərləri hash olunmuş sırayla verir
//        nums.add(5);
//        nums.add(2);
//        nums.add(54);
//        nums.add(4);
//        nums.add(32);
//        nums.add(5);
//        System.out.println(nums); //[32, 2, 4, 5, 54] qarışıq verir, hashdəyərlərinə görə
        //əgər biz uniclik istəyirik və sıralama önəmli deyilsə hashSet-dən istifadə edəcəyik
        //yox əgər bizə sıralamada önəmlidi və həmçinin uniclicdə lazımdısa LinkedHashset-dən istifadə edəcəyik

        //LinkedHashset
//        Set<Integer> nums = new LinkedHashSet<>();
//        nums.add(5);
//        nums.add(2);
//        nums.add(54);
//        nums.add(4);
//        nums.add(32);
//        nums.add(5);
//        System.out.println(nums); //[5, 2, 54, 4, 32] oldughu kimi verdi

        //TreeSet  -  null qəbul etmir
//        Set<Integer> nums = new TreeSet<>();
//        nums.add(5);
//        nums.add(2);
//        nums.add(54);
//        nums.add(4);
//        nums.add(32);
//        nums.add(5);
////        nums.add(null); //exception verir, null qebul etmir
//        System.out.println(nums); //[2, 4, 5, 32, 54] sort kimi verdi

//        Set<String> words = new LinkedHashSet<>();
//        words.add("5");
//        words.add("2");
//        words.add("54");
//        words.add("4");
//        words.add("32");
//        words.add("5");
        //contains ilə obyekt içində dəyərin olub olmadığını yoxlanıldı
//        boolean number = words.contains("5a"); //false
//        boolean number1 = words.contains("5"); //true
//        System.out.println(number1);

//        for (String name : nums){
//            System.out.println(name);
//        }//for mentiqi ile chagirmaq

//        for (String name : words){
//            if (name.equals("5")) {

//                name = "Aslan";
//                System.out.println(name);


        //Əgər biz daha çox axtarış edəcəyiksə ArrayList istifadə etməliyik
//        ArrayList<String> words = new ArrayList<>();
//        List<String> words = new ArrayList<>();
//        words.add("Salam");
//        words.add("Kəlam");
//        words.add("BAnan");
//        words.add("Hörmət");
//        words.add("Şüşə");
//        words.add("Alma");
//        words.add("BAnan");
//
//        System.out.println(words.get(3));
//        for (String item : words){
////            System.out.println(item);
//        }
        //Əgər biz çoxlu delete və insert, update edəcəyiksə LinkedList istifadə etməliyik
//          linkedlist və array list arasında sürət və yerdəyişmə fərqi var
//        List<String> words1 = new LinkedList<>();
//        words1.add("Salam");
//        words1.add("Kəlam");
//        words1.add("BAnan");
//        words1.add("Hörmət");
//        words1.add("Şüşə");
//        words1.add("Alma");
//        words1.add("BAnan");
//
//        System.out.println(words.get(3));
//        for (String item : words){
////            System.out.println(item);
//        }









    }








        }









