package Lesson19.Teacher.Video;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
//        String text = "The quick brown fox jumps over the lazy dog.";
//
//        // q hərfi ilə olanları götürüb ekranda çap edəcək
//        Pattern pattern = Pattern.compile("\\ba\\w*");
//
//        Matcher matcher = pattern.matcher(text);
//
//        while (matcher.find()) {
//            System.out.println("Found: " + matcher.group());
//        }
    String cardNumber = "1252216513616661";
    String modifiedNumber = cardNumber.replaceAll("\\b(\\d{4})\\d{8}(\\d{4})\\b", "$1********$2");
        // \\b: Stringin başlanğıcı.
        //(\\d{4}): İlk 4 rəqəmi tutur və gruplar halına salır.
        //\\d{8}: Orta 8 rəqəmi tutur (gizlədiləcək qisim).
        //(\\d{4}): Son dört rəqəmi tutur və gruplar halına salır
        //\\b: Stringin sonunu bildirir.
        //$1********$2: nəyə dəyiştiriləcək?tutulan ilk 4 ve son 4 rəqəmi bir qırağda saxlıyır
        // ortadaki 8 rəqəmi ulduzlarla dəyişdirir. $1 ilk 4 rəqəmləri, $2 isə son 4 rəqəmləri təmsil edir.
        System.out.println(modifiedNumber);


    }
}
