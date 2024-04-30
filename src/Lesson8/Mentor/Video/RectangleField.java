package Lesson8.Mentor.Video;

import java.util.Scanner;

public class RectangleField {
    public static void main(String[] args) {
        // Fieldlərin ən son dəyişmə yeri buradır
        Rectangle r1 = new Rectangle();
        r1.color = "red";
        r1.length = 5;
        r1.width = 4;
        r1.printshape(); // printshape ile butun methodlar ishleyecek

        Rectangle s1 = new Rectangle();
        s1.color = "blue";
        s1.length = 4;
        s1.width = 4;
        s1.printshape();

        //əgər Recthangle class-ında field-lərə default dəyərlər versək, burda eyni ilə çıxacaq
        Rectangle r3 = new Rectangle();
        //scanerdən istifadə üçün
        Scanner scr = new Scanner(System.in);
        r3.width = scr.nextDouble();
        r3.length = scr.nextDouble();
        r3.color = scr.next();
        r3.printshape();
    }
}
