package Lesson11.HomeWork;

import java.util.Scanner;

public class StringClass {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Adınız: ");
        String name = scr.nextLine();
        System.out.println("Soyadınız: ");
        String surname = scr.nextLine();

        System.out.println(name.concat(surname));
    }

}
