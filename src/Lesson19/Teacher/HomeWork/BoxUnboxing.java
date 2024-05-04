package Lesson19.Teacher.HomeWork;

import java.util.Scanner;

public class BoxUnboxing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir ədəd daxil edin: ");
        int number = scanner.nextInt();

        Integer boxedNum = number;

        int unboxedNum = boxedNum;

        System.out.println("Unbox: " + unboxedNum + "\nBox: " + boxedNum);
    }
}
