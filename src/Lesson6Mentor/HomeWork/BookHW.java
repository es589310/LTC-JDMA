package Lesson6Mentor.HomeWork;

import java.util.Scanner;

public class BookHW {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Ən son oxuduğunuz kitabın adını, yazıçısını və çap ilini qeyd edin: ");

        String[] bookcontent = new String[3];
        for (int i = 0; i < bookcontent.length; i++) {
            bookcontent[i] = scr.nextLine(); //nextLine verərək terminalda hər indeks üçün ayrı hissə götürür
        }

        System.out.println("Kitab məlumatları");
        System.out.println("Adı: " + bookcontent[0]);
        System.out.println("Yazıçısı: " + bookcontent[1]);
        System.out.println("İlk çap olunduğu il: " + bookcontent[2]);
    }
}
/*Ən son oxuduğunuz kitabın adını, yazıçısını, çap ilini Scanner vasitəsilə bir arrayə doldurub çap edin. Məsələn,

Title: Season of Storms

Author: Andrej Sapkowski

Year: 2013*/
