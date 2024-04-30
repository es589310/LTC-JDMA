package Lesson5.Mentor;

public class ClassTask {
    public static void main(String[] args) {

        int sum = 0; // sum ilə aralıqda verilən rəqəmlər tutmaq üçün
//
        for (int i = 1; i < 20; i++) { //1dən 19a qədər rəqəmlər verilir
            sum += i; //bura isə yuxarıda tutulan rəqəmləri depoluyur
            if (i  != 1 ) { //1ə bərabə deyilsə yəni ilk rəqəm deyilsə sonrakinə + qoy deyir
                System.out.print("+");
            }
            System.out.print(i);
        }
        System.out.println("=" + sum);


//        for (int i = 6; i <= 16; i++) {
//            if (i == 13) {
//                continue;
//            }
//            System.out.print(" " + i);
//
//        }
    }}
