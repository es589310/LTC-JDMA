package Lesson7Mentor;

import java.util.Arrays;

public class Lesson7 {
    public static void main(String[] args) {
        int[] num1 = new int[]{1, 2, 3};
        int[] num2 = new int[]{4, 5, 6};
        int[] num3 = new int[]{7, 8, 9};
    int[][] numbers = new int[][] {num1, num2, num3};
//        System.out.println(Arrays.deepToString(numbers)); //bu hazır arrayin içində array halında verir
//        for (int[] i : numbers){
//            System.out.println(Arrays.toString(i));
//        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
//                //təkcə i-ni versəm 0 0 0 1 1 1 2 2 2 ayrıca verir, çünki indekslərin özünü ayrıca döndürür
//                //təkcə j-ni versəm (0 1 2)* 3 dəfə indekslərin özünü verir
//                //numbers[i][j] bu tərz isə artıq array daxilindəki arraylari verir
            }
        }

//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers.length; j++) {
//                if (j == i) {
//                    System.out.print(" " + numbers[i][j] + " ");
//                }else {
//                    System.out.print(" 0 ");
//                }
//            }
//            System.out.println();
        }
        /*
        1 (numbers[0][0])
        5 (numbers[1][1])
        9 (numbers[2][2]) for i==j.
        */
        /*
        diagonal variantda - if-də səliqəli olması üçün boşluqlar qoyulur
        else halında isə deyilirki boş yerləri 2 boşluq qoy və diagonal hala gətir
          1
            5
              9
         */
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers.length; j++) {
//                if (j != i) {
//                    System.out.print(" " + numbers[i][j] + " ");
//                }else {
//                    System.out.print(" 0 ");
//                }
//            }
//            System.out.println();
//        }



    }

