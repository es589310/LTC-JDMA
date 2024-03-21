package Lesson4;

import java.util.Scanner;

public class TestHW {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Test nəticələrinizi yoxlamaq üçün topladığınız balı daxil edin: ");
        int testNumber = scr.nextInt();




//        if(testNumber>100 || testNumber<0){
//            System.out.println("Belə bir test nəticəsi yoxdur!");
//            return; // return səbəbi default dəyəri oxumaması üçündür
//        }
//
//        int newTestNumber = (testNumber -1 ) / 10;
//
//        switch (newTestNumber){
//            case 9:
//                System.out.println("A");
//                break;
//            case 8:
//                System.out.println("B");
//                break;
//            case 7:
//                System.out.println("C");
//                break;
//            case 6:
//                System.out.println("D");
//                break;
//            default:
//                System.out.println("F");
//
//        }


        // - Relational operators / Logical operators / if-else statement
//

//        if (testNumber<0 || testNumber>100) {
//            System.out.println(testNumber + " - yazdığınız rəqəm doğru deyil!");
//        }else if (testNumber > 0 && testNumber < 61) {
//            System.out.println(testNumber + " bal ilə testin hərf qiyməti F");
//        }
//        else if (testNumber >= 61 && testNumber < 71) {
//            System.out.println(testNumber + " bal ilə testin hərf qiyməti D");
//        } else if (testNumber > 70 && testNumber < 81) {
//            System.out.println(testNumber + " bal ilə testin hərf qiyməti C");
//        }else if (testNumber > 80 && testNumber < 91) {
//            System.out.println(testNumber + " bal ilə testin hərf qiyməti B");
//        }else {
//            System.out.println(testNumber + " bal ilə testin hərf qiyməti A");;
//        }


//         Ternary operator
//        int testnumber = scr.nextInt();
//
//        String num = (testnumber > 100) ? "Sadəcə 0 ilə 100 arasında rəqəm daxil edin!" :
//                            (testnumber <= 100 && testnumber >= 91) ? "A" :
//                                    (testnumber <= 91 && testnumber >= 81) ? "B" :
//                                            (testnumber <= 81 && testnumber >= 71) ? "C" :
//                                                    (testnumber <= 71 && testnumber >= 61) ? "D" :
//                                                            (testnumber <= 61 && testnumber >= 50) ? "F" : "kesilmisen";
//
//
//        String result = (testnumber>100) ? "Hərf Dəyəri: " + num : "Test balı " + testnumber + ", Hərf Dəyəri: " + num;
//
//        System.out.println(result);

//        if (testnumber>100){
//            System.out.println("Hərf Dəyəri: " + grade);
//        }else {
//            System.out.println("Test balı " + testnumber + ", Hərf Dəyəri: " + grade);
//        }
    }
}
