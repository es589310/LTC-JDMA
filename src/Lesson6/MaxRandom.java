package Lesson6;

import java.util.Arrays;
import java.util.Random;

public class MaxRandom {
    public static void main(String[] args) {
        Random rnd = new Random(); // Random rəqəmlər üçün class verdim
        int[] num = new int[10]; //int tərzi ilə num array-ni 10 index hazırladım
        int max = num[0]; // max. rəqəmi tapmaq üçün num-ı 0 edərək bərabərləşdirdim
        for (int i = 0; i < num.length; i++) {
        num[i] = rnd.nextInt(1,21); //1 və 21(daxil deyil) arasında rəqəmlər Random tapmasını istədim
            if (max < num[i]) {
                max = num[i];
            }
//            System.out.println(Arrays.toString(num)); //içində olarkən loopu təkrar təkrar yanındaki 0-larla çap edir
        }
        System.out.println(max);
//yuxarıda 0 vermişdik və bunu max.-a bərabər etmişdik, həmən max hər döngüdə bir bir artıdğı zaman həmən döngüdə num-dan balaca olur
// taaki numdan böyük olana qədər döngünü yoxluyur. Max böyükdürsə döngü dayanır və aşağıdaki sətrə göndərir

    }
}
