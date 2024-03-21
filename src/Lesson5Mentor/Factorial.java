package Lesson5Mentor;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // factorial
        int  factorial = 1;
        int num = scr.nextInt();
        for (int i=1; i<=num; i++) {
            factorial=factorial*i;
        }
        System.out.println(num +" faktorialı " + factorial);

    }
}
