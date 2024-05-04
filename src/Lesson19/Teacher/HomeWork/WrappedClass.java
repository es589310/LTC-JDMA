package Lesson19.Teacher.HomeWork;
import java.util.Scanner;

public class WrappedClass {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Integer bir ədəd daxil edin: ");
         int number = scanner.nextInt();

         Integer doubleNumber = number * 2;

         System.out.println("Daxil etdiyiniz ədədin iki qatı: " + doubleNumber);

    }

}
