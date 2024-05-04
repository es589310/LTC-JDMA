package Lesson19.Teacher.HomeWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Cümlə: ");
        String sentence = scr.nextLine();

        Pattern pattern = Pattern.compile("\\bS\\w*\\b");
        Matcher matcher = pattern.matcher(sentence);

        System.out.println("'S' hərfi ilə başlayan sözlər:");
        //Sabahın sərin vaxtında çöldə sürpriz kimi hava olur.
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
