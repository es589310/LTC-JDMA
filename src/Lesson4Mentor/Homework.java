package Lesson4Mentor;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
//        String m=scr.next();
//        String days31="ayda 31 gun var";
//        String days30="ayda 30 gun var";
//        String day28="ayda ya 28 ya 29 gun var";
//        switch (m){
//            case "yanvar","mart","may","iyul","avqust","oktyabr", "dekabr":
//                System.out.println(days31); break;
//            case "aprel", "iyun","sentyabr", "noyabr":
//                System.out.println(days30);
//                break;
//            case "fevral":
//                System.out.println(day28);
//        }



        System.out.println("Ayı daxil edin:");
        String month = scr.next();
        System.out.println("İli daxil edin:");
        int year = scr.nextInt();
        int numDays = 0;

        switch (month){
            case "Yanvar","Mart","May","Iyul","Avqust","Oktyabr","Dekabr":
                numDays = 31;
                break;
            case "Aprel","İyun","Sentyabr","Noyabr":
                numDays = 30;
                break;
            case "Fevral":
                if ((!(year % 100 == 0) &&  (year % 4 == 0) ) || (year % 400 == 0))
                        numDays = 29;

                else
                    numDays = 28;
                break;
            default:
                System.out.println("Belə bir ay yoxdur");
                break;
        }
        System.out.println(numDays + " gün" );


//        Scanner scanner=new Scanner(System.in);
//        System.out.println("İli daxil edin");
//        int year=scanner.nextInt();
//        if (year%400==0){
//            System.out.println("Daxil etdiyiniz il 366 gündür");
//        } else if (year%100==0) {
//            System.out.println("Daxil etdiyiniz il 365 gündür");
//
//        } else if (year%4==0) {
//            System.out.println("Uzun ildir");
//
//        }else System.out.println("Qisa ildir");
//    }
    }
}
