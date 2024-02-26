package Lesson_2;

import java.util.Scanner;

public class calculator_task {
    public static void main(String[] args){
//method 1
/*
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci rəqəm: ");
        int number1 = input.nextInt();
        System.out.println("İkinci rəqəm: ");
        int number2 = input.nextInt();

        System.out.println("Cəmi - "+(number1 + number2));
        System.out.println("Fərqi - "+(number1 - number2));
        System.out.println("Qismət - "+(number1 / number2));
        System.out.println("Hasil - "+(number1 * number2));
*/


//method 2
        /*
        int number1;
        int number2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci ədədi daxil edin: ");
        number1 = scanner.nextInt();

        System.out.print("İkinci ədədi daxil edin: ");
        number2 = scanner.nextInt();

        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        int quotient = number1 / number2;
        System.out.println("Toplam: "+ sum);
        System.out.println("Ferq: " + difference);
        System.out.println("Hasil: " + product);
        System.out.println("Qismət: " + quotient);
*/


//method3
        Scanner calculator = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Birinci rəqəm: ");
        num1 = calculator.nextInt();
        System.out.println("İkinci rəqəm: ");
        num2 = calculator.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;


        if (num2 != 0){
            double quotient =(double) num1 / num2;
            System.out.println("Qismət: " + quotient);
        } else {
            System.out.println("0-a bölünmə işi səhv aparılır!");
        }
//        faizi ən aşağı salmasam 0-la bağlı kod işləmir
        int remainder = num1 % num2;

        System.out.println("Cəm - " + sum);
        System.out.println("Fərq - " + difference);
        System.out.println("Hasil - " + product);
        System.out.println("Faiz - " + remainder);



// method 4
        /*
        double number1;
        double number2;

        Scanner decimalNumbers = new Scanner(System.in);

        System.out.println("Birinci onluq ədədi: ");
        number1 = decimalNumbers.nextDouble();
        System.out.println("İkinci onluq ədədi: ");
        number2 = decimalNumbers.nextDouble();

        System.out.println("Onluq ədədlərin cəmi: " + (number1+number2));
        System.out.println("Onluq ədədlərin fərqi: " + (number1-number2));
        System.out.println("Onluq ədədlərin qisməti: " + (number1/number2));
        System.out.println("Onluq ədədlərin hasili: " + (number1*number2));
        System.out.println("Onluq ədədlərin faizi: " + (number1%number2));
    */}

}
