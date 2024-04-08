package Lesson7Mentor.Exercise;

import java.util.Arrays;
import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {
        int[][] randomNum = new int[3][8];
        Random random = new Random();
        for (int i = 0; i < randomNum.length; i++) {
            for (int j = 0; j < randomNum[i].length; j++) {
                randomNum[i][j] = random.nextInt(100);

            }
        }
        System.out.print(Arrays.deepToString(randomNum));
    }
}
