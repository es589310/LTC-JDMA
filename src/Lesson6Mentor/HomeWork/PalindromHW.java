package Lesson6Mentor.HomeWork;

import java.util.Scanner;

public class PalindromHW {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Ədədi yazın: ");
        int r,sum=0,temp; //sum eyni zamanda temp-ə bərabər olur
        int n=scr.nextInt();

        temp=n; //1991 = temp
        while(n>0){ //1991>0
            r=n%10;  // verilən ədədin ən son rəqəmini verir - r = 1991 % 10 = 1=r
            sum=(sum*10)+r; // sum = (sum*10) + 1 // (0*10)+1 =1 / (0*)
            n=n/10; //1991=1991/10 = 199/
        }
        if (temp == sum) {
            System.out.println(temp + " palindromdur");
        }else {
            System.out.println(temp + " palindrom deyil");
        }
    }
}
