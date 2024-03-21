package Lesson7;//package Lesson7;
//
//import java.util.Scanner;
//
//public class other {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] car1 = new String[3];
//        String[] car2 = new String[3];
//        String[] car3 = new String[3];
//        String[] car4 = new String[3];
//        String[] rezerv = {"--", "REZERV", "--"};
//        String[] rezerv2 = {"--", "REZERV", "--"};
//        String[][] qaraj = {rezerv2, rezerv, car1, car2, car3, car4};
//        System.out.println("---QARAJ---\nBoş saxlamaq istədiyiniz yer üçün: 'Empty' daxil edə bilərsiniz!\n");
//        for (int i = 5; i >= 2; i--) {
//            System.out.println("Boş yerlərin sayı -- " + (i - 1) + " --");
//            System.out.print("Marka daxil edin:");
//            qaraj[i][0] = sc.nextLine();
//            if (qaraj[i][0].equalsIgnoreCase("Empty")) {
//                qaraj[i][0] = "--";
//                qaraj[i][1] = "Avtomobil Yoxdur";
//                qaraj[i][2] = "--";
//                continue;
//            }
//            System.out.print("Model daxil edin:");
//            qaraj[i][1] = sc.nextLine();
//            System.out.print("ili daxil edin:");
//            qaraj[i][2] = sc.nextLine();
//            System.out.println("----------------");
//        }
//        System.out.println("Qarajı GENişLətMƏK istəyirsiniz? 'Beli' və ya ''Xeyr");
//        String cavab = sc.nextLine();
//        if (cavab.equalsIgnoreCase("Beli")) {
//            for (int i = 1; i >= 0; i--) {
//                System.out.print("Marka daxil edin:");
//                qaraj[i][0] = sc.nextLine();
//                if (qaraj[i][0].equalsIgnoreCase("Empty")) {
//                    qaraj[i][0] = "--";
//                    qaraj[i][1] = "Avtomobil Yoxdur";
//                    qaraj[i][2] = "--";
//                    continue;
//                }
//                System.out.print("Model daxil edin:");
//                qaraj[i][1] = sc.nextLine();
//                System.out.print("ili daxil edin:");
//                qaraj[i][2] = sc.nextLine();
//                System.out.println("----------------");
//            }
//        }
//        System.out.println("--Qarajdakı avtomobillər--\n\nMARKA--MODEL--iL--SıRA Nömrəsi\n");
//        int k = 0;
//        for (int i = 5; i >= 0; i--) {
//            k++;
//            for (int j = 0; j < 3; j++) {
//                System.out.print(qaraj[i][j] + " ");
//            }
//            System.out.print("  - NÖMRƏ [" + k + "]\n");
//        }
//
//
////        String marka = "Tesla";
////        String model = "Model S";
////        String year = "2019";
////
////        String[][] carsgarage = {
////                {"Marka: ", "Model: ", "Buraxılış ili:"},
////                {marka, model, year}
////        };
////
////        for (int i = 0; i < carsgarage.length; i++) {
////            for (int j = 0; j < carsgarage[i].length; j++) {
////                System.out.printf("%-15s", carsgarage[i][j]);
////            }
////            System.out.println();
////        }
//    }
//}

import java.util.Random;

public class Main{
    public static void main(String[] args) {
        // Define dimensions
        int outerSize = 3;
        int innerSize = 8;

        // Create a 2D array filled with random numbers
        int[][] twoDimArray = new int[outerSize][innerSize];
        Random random = new Random();

        // Fill the array
        for (int i = 0; i < outerSize; i++) {
            for (int j = 0; j < innerSize; j++) {
                twoDimArray[i][j] = random.nextInt(100); // Random numbers between 0 and 99
            }
        }

        // Print the 2D array
        for (int i = 0; i < outerSize; i++) {
            for (int j = 0; j < innerSize; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
