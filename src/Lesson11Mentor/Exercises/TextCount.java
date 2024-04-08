package Lesson11Mentor.Exercises;

import java.util.Scanner;

public class TextCount {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String longText = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.";
        System.out.println("Hansı simvol neçə dənədir?");
        char charToCount = scr.next().charAt(0);
        int charCount = countOccurences(longText,charToCount);
        System.out.println(charCount);

        int wordCount = countWords(longText);
        System.out.println("Söz sayısı: " + wordCount);
    }
    public static int countWords(String longText){
        String[] s = longText.split(" ");
        return s.length;
    }
    public  static int countOccurences(String longText, char charToCount){
        int count = 0;
        for (int i = 0; i < longText.length(); i++) {
            if (longText.charAt(i)==charToCount) {
                count++;
            }
        }
        return count;
    }
}
