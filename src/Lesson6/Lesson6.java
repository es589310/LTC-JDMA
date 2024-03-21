package Lesson6;

import java.util.Arrays;

public class Lesson6 {
    public static void main(String[] args) {
        // 1855 dənə elan varsa onları bir bir yaza bilməyəcəyik
        // buna görədə Array[] -dən istifadə edəcəyik
//        String car1 = "Ford Fusion";
//        String car2 = "Ford Mustang";
//        String car3 = "Ford Focus";
//        String car4 = "Ford Escape";
//        String car5 = "Ford Transit";
        //yuxaridakindansa bu daha uygundur
        // arrayin ölçüsü 1 dəfə təyin edilir
//        String[] ford = {"Ford Fusion","Ford Mustang","Ford Focus", "Ford Escape", "Ford Transit"};
//        System.out.println(ford[4]);
//        for (int i = 0; i < ford.length; i++) { // i<100 ifadəsi yanlışdır
//            System.out.println(ford[i]);
//        }
//        for (int i = 0; i <= ford.length - 1; i++) {
//            System.out.println(ford[i]);
//        }
//        for (String i : ford){
//            System.out.println(i);
//        }

        // Declaration of arrays
//        int[] intArray;
//        String[] stringArray;
//        double[] doubleArray;

        int[] numbers = {1, 2, 3, 4, 5}; // Initializing an integer array
//        System.out.println(numbers[0]);
//        for (int i : numbers){
//            System.out.println(i);
//        }


        int a; //declaration(16bit), a-nın olacağını deyirik ancaq onun nə olduğunu demirik
        a = 5; //initialization

//        int[] nums; // yaddashi 0
//        nums = new int[]{1,2,3}; //yaddaşı 3 * 16bit olacaq | int[3]olsa belə yaddaş ayırır

//        nums = new int[3];
//        for (int i = 0; i < 3; i++) {
//            System.out.println(nums[i]); // 3 eded 0 verir
//            System.out.println(nums); // [I@a09ee92 = [ array, I int olduğunu bildirir
//            System.out.println(Arrays.toString(nums));
//        }

//        char[] i = new char[] {'a','b','c'};
//        System.out.println(i);

        //array-lər immutable-dir, yəni dəyişdirilə bilməz.
        //array-ə yeni indeks əlavə etmək üçün isə bu yola əl atılır
//        int[] nums;
//        nums = new int[]{23,1,2,32,423,2,4343,54,543};
//        int[] nums2 = Arrays.copyOf(nums, nums.length + 1);
//        nums2[3] = 4;
//        //kiçikdən böyüyə doğru düzmək üçün
//        Arrays.sort(nums2);
//        nums2[nums2.length - 1] = 5; // bu yolla ən son elementi dəyişə bilirik
//        System.out.println(Arrays.toString(nums2));


        // Arrays.fill ilə yeni bir array dəyişkəni ayarlayıb ona istədiyin rəqəmi ona ver
//        int[] nums3;
//        nums3 = new int[6];
//        Arrays.fill(nums3, 9);
//        System.out.println(Arrays.toString(nums3));

        //Tekce String obyektdir
        //String ile sort
        String[] abc = new String[]{"A","V","L","F","B"};
        Arrays.sort(abc);
        System.out.println(Arrays.toString(abc));


//        String[] cars = new String[5]; // arrayi yaradıb ölçüsünü istədiyimiz qədər təyin edə bilirik = 5
//        cars[0] = "Ford Fusion";
//        cars[1] = "Ford Mustang";
//        cars[2] = "Ford Focus";
//        cars[3] = "Ford Escape";
//        cars[4] = "Ford Transit";
//        cars[5] = "Ford f150"; //Index 5 out of bounds for length 5 - error verecek








//        int[] num = {25,2,3,4,5,6,7,8,9,10};
//        System.out.println(num[15]);
//        for (int i = 0; i < num.length; i++) {
//            System.out.print(i);
//        }
//        for(int emin : num){
//            System.out.print(emin);
//        }

//        String[] array;
//        array = {"alma",}

//        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(intArray[5]);
//
//        int[] num = new int[13];
//        num[0] = 23;
//        num[1] = 13;
//        num[3] = 6;
//        num[4] = 43;
//        num[5] = 73;
//        num[6] = 101;
//        num[7] = 26;
//        num[8] = 14;
//        num[9] = 46;
//        num[10] = 99;
//        num[11] = 55;
//        num[12] = 85;
////        num[13] = 98;
//
//    for (int i : num){
//        System.out.print(i + ", ");
//    };

    }
}
