package Lesson19.Teacher.Video;

public class WrapperType {
    public static void main(String[] args) {
        //bir tipi başqa bir tipə çevirmək kimi istifadə olunur

        int num = 15;
        //primitiv tipi wrapper type(reference) çevirdik
        Integer a = Integer.valueOf(num); //boxing prosesi
        //yenidən primitv tip etsək
        int b = a; // unboxing

        String text = "23";

        Integer i = Integer.valueOf(text);
        System.out.println(i.getClass().getName()); //java.lang.Integer

        String s = String.valueOf(i);
        System.out.println(s.getClass().getName()); //java.lang.String

        Boolean c = false;
        String s1 = String.valueOf(c);
        System.out.println(s1.getClass().getName()); //java.lang.String

        String words = "6523";
        int e = Integer.parseInt(words);
        //parseInt = string-i int-ə çevirir || scanerdən nəsə alanda çevirib ötürmək üçün məhsuldardı
        System.out.println(e);



    }
}
