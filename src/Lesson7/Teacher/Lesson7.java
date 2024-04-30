package Lesson7.Teacher;

import java.util.Arrays;

public class Lesson7 {
    public static void main(String[] args) {
        //iki ölçülü array-in 1-ci yazılışı
        String [] USA = {"Ford","Chevrolet","Cadillac","Dodge"};
        String [] EU = {"Mercedes","BMW","Audi","Porsche"};
        String [] JAPAN = {"Mitsubishi","Mazda","Kia","Nissan"};
        //1-ci cür çap etmək
//        for (int i = 0; i < USA.length; i++) {
//            System.out.println(USA[i]);
//        }
        //2-ci cür çap etmək
//        for (String i : JAPAN){
//            System.out.println(i);
//        }
        
        //iki ölçülü array-in 2-ci yazılışı
        String[][] cars = {
//                USA,EU,JAPAN // array içinə bir array
                {"Ford","Chevrolet","Cadillac","Dodge"},
                {"Mercedes","BMW","Audi","Porsche"},
                {"Mitsubishi","Mazda","Kia","Nissan"}
        };

        //yeni array müəyyən etmək
//        String[][] cars2 = new String[3][4]; //4 sətir və 5 sütun uzunluğunda cədvəl hazırlayır
//        cars2[0] = USA; //təkcə bir indeks daxilini göstərsin və USA-i 0-cı indeksə verir
//        cars2[0][1] = "Chevrolet"; //bunu isə 0-cı indeksin 1ci indeksinə verir
//        System.out.println(cars2[0][3]); // bu bir-bir ekrana çap etməyimiz üçündür

        // ikili array-i oxumaq üçün loop içində loop olacaq, 1-ci ümumi arrayi, 2-ci içindəki arraylari oxuyacaq
        for (int i = 0; i < cars.length ; i++) { //1-ci for ümumi array-dir
            for (int j = 0; j < cars[i].length; j++) { //bu isə array içindəki arraylardir
                System.out.println(cars[i][j]);
            }
            System.out.println("__________________");
        }


//        String[][] name = new String[3][4];
//        name[0][0] = "Ad: ";
//        name[0][1] = "Iphone";
//        name[0][2] = "Xiomi";
//        name[0][3] = "Samsung";
//        name[1][0] = "Qiymət: ";
//        name[1][1] = "3 trl. $";
//        name[1][2] = "46 mln $";
//        name[1][3] = "91.4 mlr $";
//        name[2][0] = "Keyfiyyət: ";
//        name[2][1] = "Yüksək";
//        name[2][2] = "Orta";
//        name[2][3] = "Yüksək";
//        name[3][0] = "Şirkətin Yaranma Tarixi: ";
//        name[3][1] = "1976";
//        name[3][2] = "2010";
//        name[3][3] = "1938";
//        System.out.println(Arrays.deepToString(name));
//        for (int i = 0; i < name.length; i++) {
//            for (int j = 0; j < name[i].length; j++) {
//                System.out.println(name[i][j]);
//            }
//            System.out.println("-----------");
//        }

//        int[][] num = new int[2][2];
//        num[0][0] = 1;
//        num[0][1] = 2;
//        num[1][0] = 3;
//        num[1][1] = 4;
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                System.out.println(num[i][j]);
//            }
//            System.out.println("------");
//        }
    }
}
