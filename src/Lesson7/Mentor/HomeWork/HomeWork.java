package Lesson7.Mentor.HomeWork;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String[][] emptyArray = new String[3][3];
        System.out.println("Cədvəl üçün bir mətn daxil edin: ");
        String words = scr.nextLine();

        System.out.println("Neçənci sətir? ");
        int row = scr.nextInt();
        System.out.println("Neçənci sütun? ");
        int column = scr.nextInt();

        emptyArray[row][column] = words;

        for (int i = 0; i < emptyArray.length; i++) {
            for (int j = 0; j < emptyArray[i].length; j++) {
                if (emptyArray[i][j] == null) {
                    System.out.printf("%-4s","( * )");
                }else {
                    System.out.printf("%-4s","("+ emptyArray[i][j] +")");
                }
            }
            System.out.println();
        }
    }
}
        // 3x3 boş bir string dizisi oluştur
        // Kullanıcı girişi için bir tarama aracı oluştur
        // Kullanıcıdan bir string girmesini iste
        // Kullanıcıdan satır ve sütun belirtmesini iste
        // Girilen konumda diziyi güncelle
        // Güncellenmiş diziyi görüntüle











