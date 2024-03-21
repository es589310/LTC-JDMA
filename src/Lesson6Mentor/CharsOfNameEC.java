package Lesson6Mentor;

import java.lang.reflect.Array;
import java.util.Scanner;

public class CharsOfNameEC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        System.out.print("Adınzı qeyd edin: ");
        String namestr = input.next();
        char[] name = namestr.toCharArray();
        System.out.print("Ad: ");
        for(i=0; i < name.length; i++){
            System.out.print(name[i]);
        }

        int arraysize = namestr.length();
        System.out.println("\nAdın ölçüsü: " + arraysize);




        //        char name[] = scr.nextInt().ch
//        Scanner input = new Scanner(System.in);

    }
}
