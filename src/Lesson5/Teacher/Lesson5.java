package Lesson5.Teacher;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        //Loops
        Scanner scr = new Scanner(System.in);
        //for
        //for-da konkret rəqəmlər arasında iş görə bilirik, boolen tərzi nəsə qoya bilmirik

//        for (int i=0; i<100; i+=1) // fori -yə basaraq bu funksiyanı aktiv edə bilirik
//        // i = 0 -dan başla, 100-ə qədər get və hər dəfəsində i-ni 1 vahid artır
//        // i++(i=i+1) i=0-ı hər dəfə bir vahid artırıb i<100 həddinə çatdırır
//        {
//            System.out.println("heeeey dünya " + i);
//        }
//        System.out.println("enough!");

        //true götürür, loop-a girir, false isə götürmür
//        for (int i = 0; true; i++) {
//            System.out.println(i);
//        }
//        //boolen ilə true
//        boolean check = true;
//        for (int i = 0; check; i++) {
//            System.out.println(i);
//            if (i == 50){
//                check=false;
//            }
//        }
        

        //while

//        int start = 1;
//        while (start<=100){
//            System.out.println("Start"+start); //tək belə etsək loop-a girəcək
//            start--; //loop-a girməyəcək


//        boolean check = true;
//        int start = 1;
//        while (check){
//            System.out.println(start);
//            if (start==50){
//                check = false;
//            }
//            start++;
//        }


        //do-while
//        int startValue = 1;
//        // ən az istifadə olunan while loop-udur
//        do {
//            System.out.println(startValue);
//            startValue++;
//        }while (startValue<=100);

//        bu intervyu sualıdır
//        int startValue = 0;
//        do {
//            System.out.println(startValue);
//            startValue++;
//        }while (startValue>=100); // bu mümkünsüz şərt olduğu üçün həmi do-while ilk sout-u verecek

//        do-while ilə while-ın fərqi, while-da şərt ödənməsə ekrana heçnə çap olunmur, do-while-da şərt ödənməsə belə ekrana ilk sout çap olunacaq
        
//            // break - if-i verib dayanır
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Start! " + i);
//            if (i == 52) {
//                break;
//            }
//        }
//        System.out.println("Finish!");

                // continue --
//        for (int i = 1; i < 100; i++) {
//            if (i > 23 && i < 52) {
//                continue;
//            }
//            System.out.println("Start! " + i);
//        }
//        System.out.println("Finish!");
        
        
        
        
        
        
//        int bal = scr.nextInt(); //balı götürür
////           switch case-dən rahat keçməyi üçün balı filter edir,
//        bal = bal / 10; // 10 a bölür, əgər tam bölünməsə atır filterə(if)
//        if (bal % 10 == 0){ //bal=95dirsə onun qalıqlı variantını 0 edir
//            bal--; //ondan bir çıxır
//        }
//        switch (bal){
//            case 1:
//                System.out.println("Bal miktarı 1'e eşittir. Özel bir durum olabilir.");
//                break;
//        }

//        int num = scr.nextInt();
//        while (num <= 5){
//            System.out.println(num);
//            num++;
//        }

    }
}

