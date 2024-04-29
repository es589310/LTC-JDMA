package Lesson18.Teacher.HomeWork.EntertainingLevel;

import java.time.Year;

public class StringBuildEL {
    public static void main(String[] args) {

        int year = Year.now().getValue();
//        String changeString = String.valueOf(year);

        StringBuilder change = new  StringBuilder(String.valueOf(year));

//        change.insert(0,changeString);
        System.out.println("String olunmuş: " + change);

    }
}
