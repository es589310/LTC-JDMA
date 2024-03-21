package Lesson3;

import java.util.Scanner;

public class LevelNormal {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Hər hansı bir ədəd daxil edin: ");
        int number1 = scr.nextInt();

//      20-dən böyükdür yoxsa balacadırmı?
        if(number1>20){
            System.out.println("Yazdığınız rəqəm 20-dən böyükdür");
        }else {
            System.out.println("Yazdığınız rəqəm 20-dən balacadır");
        }



        //      Random
        int randomNumber = (int) (Math.random() * 6) + 1;
        System.out.println("1 ilə 6 arasında təsadüfi bir ədəd yazın: ");
        System.out.println("Random ədəd: " + randomNumber);

        int randTam = randomNumber + number1;
        System.out.println("Random və tam ədədin cəmi: " + randTam);




        // Onluqla tam ədədlərin cəmi
        System.out.println("Onluq ədəd daxil edin: " );
        int number = scr.nextInt();

        int sum = number+number1;
        System.out.println("Onluq və tam ədədlərin cəmi: " + sum);
//

        // 10-dan böyükdürmü/balacadırmı? Və böyükdürsə ədədin mənfisini versin
        if(number>10){
            System.out.println("10dan boyukdur" + number);
            number = -number;
            System.out.println("Mənfisi: " + number);
        }else {
            System.out.println("Eded ondan kicikdir\n" + number);}



        // Təkmi cütmü?
        if (number % 2 == 0){
            System.out.println("Cüt ədəd: " + number);
        }else {
            System.out.println("Tək ədəd: " + number);
        }






    }
}

/*
1. Giriş: Kullanıcıdan bir tamsayı girmesini isteyin.
2. İlişkisel Operatörler: Girilen tam sayının 10'dan büyük olup olmadığını kontrol edin.
3. Tekli Operatörler: Tamsayı 10'dan büyükse olumsuzluğunu gösterin; aksi takdirde orijinal değerini görüntüleyin.
4. Mantıksal Operatörler: Tam sayının çift olup olmadığını kontrol edin (kalan operatörünü '%' kullanın). Çift ise, çift olduğunu belirten bir mesaj görüntüleyin; eğer tuhafsa, tuhaf olduğunu belirten bir mesaj görüntüleyin.
5. Tarayıcı, Giriş ve Çıkış: Kullanıcıdan ondalık sayı girmesini isteyin. Daha sonra girilen ondalık sayı ile tam sayının toplamını görüntüleyin.
6. Math.random: 1 ile 6 arasında rastgele bir sayı üretin ve bunu tamsayıya ekleyin.
7. If-Else Giriş: Nihai sonuç 20'den büyükse, bunun 20'den büyük olduğunu belirten bir mesaj görüntüleyin; aksi takdirde 20'den büyük olmadığını belirten bir mesaj görüntüleyin.


 */


