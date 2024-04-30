package Lesson4.Teacher.TestHW;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Test nəticələrinizi yoxlamaq üçün topladığınız balı daxil edin: ");
        int testnumber = scr.nextInt();

        String num = (testnumber > 100) ? "Sadəcə 0 ilə 100 arasında rəqəm daxil edin!" :
                            (testnumber <= 100 && testnumber >= 91) ? "A" :
                                    (testnumber <= 91 && testnumber >= 81) ? "B" :
                                            (testnumber <= 81 && testnumber >= 71) ? "C" :
                                                    (testnumber <= 71 && testnumber >= 61) ? "D" :
                                                            (testnumber <= 61 && testnumber >= 50) ? "F" : "kesilmisen";


        String result = (testnumber>100) ? "Hərf Dəyəri: " + num : "Test balı " + testnumber + ", Hərf Dəyəri: " + num;

        System.out.println(result);

    }
}
