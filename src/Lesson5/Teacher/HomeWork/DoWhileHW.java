package Lesson5.Teacher.HomeWork;

import java.util.Scanner;

public class DoWhileHW {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int number = 23;
        int guess;

        do {
            if (scr.hasNextInt()) { // hasNextInt terminalda yazacağımın rəqəm yoxsa hərf olduğunu yoxlayır
                guess = scr.nextInt();
                if (number == guess) {
                    System.out.println("Əla! Gizli rəqəmi doğru tapdınız!");
                    break;
                } else if (number < guess) {
                    System.out.println("Təxmininiz gizlətdiyim rəqəmdən böyükdür.");
                } else {
                    System.out.println("Təxmininiz gizlətdiyim rəqəmdən kiçikdir.");
                }
            }else {
                String exit = scr.next();
                if (exit.equalsIgnoreCase("exit")) // equalsIgnoreCase ilə terminalda exit və ya Exit yaza biləcəm
                {
                    System.out.println("Oyundan çıxıldı");
                    break;
                }else {
                    System.out.println("Oyundan çıxmaq üçün 'Exit' yazın və ya oyuna davam edin.");
                }
            }
        } while (true); // təxmin doğru rəqəmə bərabər deyilsə oyuna davam edəcək
//         guess != number etsəydim guess-i görməyəckti, bura true doğru rəqəm tapılan şərtə break verərək işi həll etdim




//         do-while (2)
//            if (guess == 0){
//                System.out.println("-Çıxışdasınız-");
//                break;
//            }else if (number == guess)  {
//                System.out.println("Əla! Gizli rəqəmi doğru tapdınız!");
//            }else if (number < guess)  {
//                System.out.println("Təxmininiz gizlətdiyim rəqəmdən böyükdür.");
//            }else {
//                System.out.println("Təxmininiz gizlətdiyim rəqəmdən kiçikdir.");
//            }

    }
}
