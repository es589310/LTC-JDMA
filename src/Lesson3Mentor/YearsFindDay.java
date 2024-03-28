package Lesson3Mentor;

import java.util.Scanner;

public class YearsFindDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Salam! Sizin üçün neçə günü hesablaya bilərəm?: ");
        int sum_days = sc.nextInt();

        int years = sum_days / 365; //500 / 365 = 1
        int ryears = sum_days % 365; //500 % 365 = 135

        int months = ryears / 30; //135 / 30 = 4
        int weeks = (ryears % 30) / 7; // 135 % 30 = 15 / 7 = 2
        int days = (ryears % 30) % 7;


        System.out.println( "İl,ay,həftə və gün etibarı ilə: " + years + " il," + months +" ay," + weeks + " həftə,"  + days +" gün");

    }
}
