package Lesson7Mentor;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        char[][] stars = new char[4][5]; // 4 sətir 5 sütun
        char charStars = '*';
        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length; j++) {
                stars[i][j] = charStars;
                System.out.printf("%-3s",stars[i][j]);
            }
            System.out.println();
        }
    }
}
