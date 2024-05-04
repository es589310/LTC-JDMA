package Lesson19.Teacher.HomeWork;

import java.util.Scanner;

public enum Month {
    DECEMBER,
    JANUARY,
    FEBRUARY,
    MART,
    APRİL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER;

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Hansı ay hansı fəsildədir? ");
        String inMonth = scr.nextLine();

        Month currentMonth = Month.valueOf(inMonth);

                if (currentMonth == Month.JUNE || currentMonth == Month.JULY || currentMonth == Month.AUGUST) {
                    System.out.println("Yay ayıdır");
                } else if (currentMonth == Month.SEPTEMBER || currentMonth == Month.OCTOBER || currentMonth == Month.NOVEMBER) {
                    System.out.println("Payız ayıdır");
                }else if (currentMonth == Month.DECEMBER || currentMonth == Month.JANUARY || currentMonth == Month.FEBRUARY) {
                    System.out.println("Qış ayıdır");
                }else if (currentMonth == Month.MART || currentMonth == Month.APRİL || currentMonth == Month.MAY) {
                    System.out.println("Yaz ayıdır");
                }else {
                    System.out.println("Yazılış səhvdir, belə ay mövcud deyil.");
                }


    }



}
