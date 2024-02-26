package Lesson_3;

import java.util.Scanner;

public class years_find_day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Salam! Sizin üçün neçə günü hesablaya bilərəm?: ");
        int sum_days = sc.nextInt();

        int years = sum_days / 365;
        int ryears = sum_days % 365;

        int months = ryears / 30;
        int weeks = (ryears % 30) / 7;
        int days = (ryears % 30) % 7;


        System.out.println( "İl,ay,həftə və gün etibarı ilə: " + years + " il," + months +" ay," + weeks + " həftə,"  + days +" gün");

    }
}
