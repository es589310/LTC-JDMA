package Lesson19.Teacher.HomeWork;

import java.util.Scanner;

public class ParseClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yaşınızı daxil edin: ");
        String ageString = scanner.nextLine();

        int age = Integer.parseInt(ageString);

        int toYears18 = 18 - age;

        if (toYears18 > 0) {
            System.out.println("18 yaşa " + toYears18 + " il qalıb.");
        } else if (toYears18 == 0) {
            System.out.println("18 yaşınız artıq var");
        } else {
            System.out.println("18 yaşından böyüksüz.");
        }

    }
}
