package Lesson_3;

import java.util.Scanner;

public class LevelEntertaining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minRange = 1;
        int maxRange = 10;
        int attempts = 5;
        int targetNumber = (int) (Math.random() * (maxRange - minRange + 1)) + minRange;

        System.out.println("Rəqəmləri təxmin et oyununa xoş gəldin!");
        System.out.println("Min. və max. arasında rəqəm verəcəm  " + minRange + " və " + maxRange + ".");

        while (attempts > 0) {
            System.out.print("\nSən öz təxmini rəqəmini daxil et: ");
            int guess = scanner.nextInt();

            if (guess == targetNumber) {
                System.out.println("Əla! Verdiyim rəqəmi düz təxmin etdin.");
                break;
            } else if (guess < targetNumber) {
                System.out.println("Təxmini rəqəm çox aşağıdır, mənim rəqəmim: " + targetNumber);
            } else {
                System.out.println("Təxmini rəqəm çox yüksəkdir, mənim rəqəmim:: " + targetNumber);
            }

            attempts--;  // Cəhdləri bir bir azaldır

            System.out.println("Qalan cəhdlər: " + attempts);
        }

        System.out.println("\nTəəssüfki cəhdləriniz bitdi, mənim rəqəmim: " + targetNumber);


    }
}
