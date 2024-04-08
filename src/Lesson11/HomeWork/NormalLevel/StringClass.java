package Lesson11.HomeWork.NormalLevel;

import java.util.Scanner;

public class StringClass {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Adınız: ");
        String name = scr.nextLine();
        System.out.println("Soyadınız: ");
        String surname = scr.nextLine();

        System.out.println(name.concat(surname));
    }

}
/*
Kullanıcıdan adını ve soyadını ayrı dizeler olarak girmesini isteyen bir Java
programı yazın. Tam bir ad oluşturmak ve bunu kullanıcıya görüntülemek için bu
dizeleri birleştirin.
 */
