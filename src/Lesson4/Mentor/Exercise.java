package Lesson4.Mentor;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Istiliyi nə ilə ölçəcəksiniz?  Celsius(C) yoxsa Fahrenheit(F)");
        char Choices = scr.next().toUpperCase().charAt(0);
        /* scr next metodunu çağırır, next daxilində nə lazımdısa onu yazmağımızı istəyir,
            toUpperCase () ilə yazdığımızı böyük hərf edir
            charAt isə yazdığımız sözün birinci indeksini götürür
        */
        System.out.println("Seçiminiz: " + Choices);

        if (Choices == 'C'){
            System.out.println("Selsius tipindən dərəcə yazın: ");
            double Celcium = scr.nextDouble();
            double Fahrenheit = (int)(Celcium * 9/5)+32;
            System.out.println("Havanın Fahrenheit dərəcəsi " + Fahrenheit);
        } else if (Choices == 'F') {
            System.out.println("Fahrenheit tipindən dərəcə yazın: ");
            double Fahrenheit = scr.nextDouble();
            double Celsium =  (int)(Fahrenheit - 32) * 5 /9;
            System.out.println("Havanın Selsius dərəcəsi " + Celsium);
        }else {
            System.out.println("Bu doğru dərəcə tipi deyil!");
        }



//        int Celsius = (Choices - 32) * 5/9;
//        int Fahrenheit = ( * 9/5) + 32;


    }
    }
