package Lesson6Mentor.Exercise;

import java.util.Arrays;
import java.util.Random;

public class ƏdədiOrtaEC {
    public static void main(String[] args) {
        int[] num = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = rnd.nextInt(1,101);
        }
        Arrays.sort(num); // sort ilə balacadan böyüyə rəqəmləri düzdük
        System.out.print(Arrays.toString(num));

        // ədədin ədədi ortası onların cəminin sayına bölünür
        int sum = 0;
        for (int array : num ){
            sum+=array; //sum = sum + array
        }
            double sumnum = (double) sum / num.length;
        System.out.println("\nCəm: " + sumnum);
/*
Exercise 1-dəki arrayi azdan çoxa düz və çap et.
*/
        }
    }

