package Lesson5Mentor;

import java.util.Scanner;

public class MultilicateTable {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
//       // Vurma Cədvəli
        System.out.print("Vurma cədvəlindən istifadə üçün bir rəqəm yazın: ");
        int num = scr.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num*i);
        }


    }
}
