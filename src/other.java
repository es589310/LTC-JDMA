import java.util.Scanner;

public class other {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a num: ");
//        int num = scanner.nextInt();
//        int sum = fibonacciSum(num);
//        System.out.println("Sum of Fibonacci numbers up to " + num + " is: " + sum);
//    }
//
//    public static int fibonacciSum(int num) {
//        if (num <= 0) {
//            return 0;
//        }
//
//        int sum = 0;
//        int prev = 0;
//        int curr = 1;
//
//        while (curr <= num) {
//            sum += curr;
//            int next = prev + curr;
//            prev = curr;
//            curr = next;
//        }
//
//        return sum;
//    int x = 5, y = 6, z = 7;
//        System.out.println(x+y+z); //18
//        double myDouble = 9d;
//        int num = (int) myDouble;;
//        int num = 9;
//        double myDouble = num;
//        System.out.println(myDouble);

//        int x = 5;
//        x =x & 1;
//        System.out.println(x);
//        1 bayt = 00000001 (8bit) 1 = 1
//        2 bayt = 00000010 2 = 1
//        3 bayt = 00000011 3 = 2
//        4 bayt = 00000100 4 = 1
//        5 bayt = 00000101 5 = 2

        int number = scanner.nextInt();
        int sum = 0;


        while (true){
            if (number >= 0) {
                break;
            }

            // add only positive numbers

            System.out.println("Enter a number");
            number = scanner.nextInt();
            sum += number;
        }

        System.out.println("Sum = " + sum);
    }
}