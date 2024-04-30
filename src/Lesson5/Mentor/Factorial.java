package Lesson5.Mentor;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // factorial
        int  factorial = 1;
        int num = scr.nextInt();
        for (int i=1; i<=num; i++) {
            factorial=factorial*i;
            //factorial = 1
            //factorial = 1 --- 1 = 1 *2
            //factorial = 2 --- 2 = 2 *3
            //factorial = 6 --- 6 = 6 *4
            //factorial = 24 --- 24 = 24 * 5
            //factorial = 120
        }
        System.out.println(num +" faktorialı " + factorial);

    }
}
