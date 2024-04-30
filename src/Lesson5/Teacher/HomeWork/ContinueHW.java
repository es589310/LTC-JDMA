package Lesson5.Teacher.HomeWork;

import java.util.Scanner;

public class ContinueHW {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " = 3-ə bölünən");
                continue; // şərtdən qabağ "sout" yazdığım üçün "continue" görülmürdü
            }
            System.out.println(i);
        }

    }
}
