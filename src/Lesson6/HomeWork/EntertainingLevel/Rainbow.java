package Lesson6.HomeWork.EntertainingLevel;

import java.util.Arrays;
import java.util.Scanner;

public class Rainbow {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String[] rainbow = {"Göy", "Yaşıl", "Qırmızı", "Bənövşəyi", "Narıncı", "Sarı", "Turkuaz"};

        for (String i : rainbow) {
            System.out.print(i + " ");
        }
        int index = scr.nextInt();
        if (index < 0 || index > 6) {
            System.out.println("Yazdığınız rəqəm yanlışdır!");
        } else {
            System.out.println("0 ilə 6 arasında bir rəqəm yazın və Göyqurşağı rəngini görün. \nSeçdiyiniz rəng: " + rainbow[index]);
        }
    }
}
