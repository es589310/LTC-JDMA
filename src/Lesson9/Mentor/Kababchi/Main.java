package Lesson9.Mentor.Kababchi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        Kabab[] kababs = new Kabab[2];
        for (int i = 0; i < kababs.length; i++) {
            System.out.println("Hansı kabab: ");
            String kababName = scr.nextLine();
            System.out.println("Kababın qiyməti: ");
            double kababPrice = scr.nextDouble();
            scr.nextLine();
            kababs[i] = new Kabab(kababName,kababPrice);
        }

        Meze[] mezes = new Meze[2];
        for (int i = 0; i < mezes.length; i++) {
            System.out.println("Hansı məzə: ");
            String mezeName = scr.nextLine();
            System.out.println("Məzənin qiyməti: ");
            double mezePrice = scr.nextDouble();
            scr.nextLine();
            mezes[i] = new Meze(mezeName,mezePrice);
        }

        İchki[] i̇chkis = new İchki[2];
        for (int i = 0; i < i̇chkis.length; i++) {
            System.out.println("Hansı içki: ");
            String ichkiName = scr.nextLine();
            System.out.println("İçkinin qiyməti: ");
            double ichkiPrice = scr.nextDouble();
            scr.nextLine();
            i̇chkis[i] = new İchki(ichkiName, ichkiPrice);
        }

        Menu menu = new Menu(kababs, mezes, i̇chkis);
        System.out.println(menu);


    }
}
