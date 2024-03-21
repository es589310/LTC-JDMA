package Lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Online mağazamıza xoş gəldiniz! Səhər yeməyi üçün ərzaqları səbətə yerləşdirə bilərsiniz: ");
        String[] shop = {"Süzmə","Yumurta","Yağ","Pendir","Pomidor","Xiyar","Zeytun"};
        System.out.print("Səhər yeməyi üçün ərzaqlar: ");
        for (String product : shop){
            System.out.print(product + " ");
        }
        do {
            System.out.println("\n0 ilə 6 arasındaki rəqəmləri yazaraq ərzaqları səbətə yerləşdirin: ");
            if (scr.hasNextInt()) {
                int index = scr.nextInt();

                if (index >= 0 && index <= 6) {
                    System.out.println(shop[index] + " səbətə qoyuldu.");
                } else {
                    System.out.println("Yazdığınız rəqəm 0 ilə 6 arasında deyil!");
                }
            }else {
                String exit = scr.next();
                if (exit.equalsIgnoreCase("exit"))
                {
                    System.out.println("Siz online mağazadan çıxdınız.");
                    break;
                }else {
                    System.out.println("Online alış verişdən çıxmaq üçün 'exit' yazın, davam etmək üçün isə müəyyən edilmiş rəqəmləri yazın. ");
                }
            }
        }while (true);

    }
}
