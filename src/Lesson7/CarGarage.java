package Lesson7;

import java.util.Scanner;

public class CarGarage {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Avtomobil məlumatlarını (marka,model və il) daxil edin.");
        String brand = scr.nextLine();
        String model = scr.nextLine();
        String year = scr.nextLine();

        System.out.println("Avtomobil məlumatlarını (marka,model və il) daxil edin: ");
        String brand1 = scr.nextLine();
        String model1 = scr.nextLine();
        String year1 = scr.nextLine();

        String[][] cars = new String[3][3];
        cars[0][0] = "Marka: ";
        cars[0][1] = "Model: ";
        cars[0][2] = "Buraxılış ili: ";
        cars[1][0] = brand;
        cars[1][1] = model;
        cars[1][2] = year;
        cars[2][0] = brand1;
        cars[2][1] = model1;
        cars[2][2] = year1;

        System.out.println("Hazırda qaraj");
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.printf("%-9s", cars[i][j]);
            }
            System.out.println();
        }

        System.out.println("Qaraj böyüdülməlidir? 'Bəli' və ya 'Xeyr' yazın.");
        String answer = scr.nextLine();
        if (answer.equalsIgnoreCase("Bəli")) {
            for (int i = 0; i < cars.length; i++) {
                System.out.println("Yeni marka:");
                String newbrand = scr.nextLine();
                if (newbrand.equalsIgnoreCase("Xeyr")) {
                    System.out.println("Qarajdaki avtomobillər: ");
                    continue;
                }
                cars[i][0] = newbrand;
                System.out.print("Model daxil edin:");
                cars[i][1] = scr.nextLine();
                System.out.print("İli daxil edin:");
                cars[i][2] = scr.nextLine();
                System.out.println("----------------");
            }
        }

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++){
                System.out.printf("%-10s", cars[i][j]);
            }
            System.out.println();
        }

    }
}
/*
1.Araç Envanteri Kurulumu:
- Sanal bir araba garajını temsil edecek 2 boyutlu bir dizi oluşturun.
    Her satır bir park alanını temsil edecek ve her sütun farklı araba özelliklerini
     (ör. marka, model, yıl) temsil edecek.
2. Garajı Göster:
- Yazma uygulaması, park edilmiş her arabanın ayrıntılarını gösteren,
    araba garajının mevcut durumunu görüntüler.
3. Araç Girişi:
  - Uygulamanın garaja girmek için yeni bir araba eklemesine izin verin.
    Kullanıcıdan araba ayrıntılarını isteyin ve garajı buna göre güncelleyin.
*/