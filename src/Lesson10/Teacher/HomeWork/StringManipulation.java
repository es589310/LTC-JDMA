package Lesson10.Teacher.HomeWork;

public class StringManipulation {
    public static void main(String[] args) {
        String text = " Memento mori memento te hominem esse Respice post te Hominem te esse memento ";

        //1  replace(target,replacement).length()
//        System.out.println(text.replace(" ", "").length());
//        System.out.println(text.replace(" ", "")); // bütün sözləri birləşdirir

        //2 toUpperCase()
//        System.out.println(text.toUpperCase());

        //3 toLowerCase()
//        System.out.println(text.toLowerCase());

        //4 startWith()
//        System.out.println(text.startsWith("A")); // false

        //5 endsWith()
//        System.out.println(text.endsWith("Z")); // false

        //6 replace(charOld,charNew).length()
//        System.out.println(text.replace("e","E"));

        //7Arrays.toString(text.split())
//        System.out.println(Arrays.toString(text.split(" ", 13)));

        //8 indexOf()
//        System.out.println(text.indexOf("o"));

        //9
//        System.out.println(text.substring(5,10));

        //10 ilk və sondaki boşluqları silir
//        System.out.println(text.trim());

        //11 repeat(count) defe tekrarlayir
//        System.out.println(text.repeat(5));  // 5 dəfə təkrarladı

        //12 getBytes() mətnin hashcode variantını göstərir
//        System.out.println(text.getBytes(StandardCharsets.UTF_8));

        //şifrəli danışmaq üçün gözəl yöntəm, hexadecimal ilə hər işarəyəgələn uyğun hərf\rəqəmlər
//        byte[] bytes = text.getBytes(StandardCharsets.UTF_8); //utf-8/16/16BE/16LE
//        for (byte b : bytes) {
//            System.out.printf("%02X ", b);
//        }

        //13 concat()
//        String firstName = "Emin ";
//        String lastName = "Panahov";
//        System.out.println(firstName.concat(lastName));

        //14
//        System.out.println("Hello\rWorld"); //World
//        System.out.println("Hello\tWorld"); //Hello    World
//        System.out.println("Hello\b World"); //Hell World
//        System.out.println("Hello\f World"); //Hello World

//        System.out.println(Math.max(5,14)); //14
//        System.out.println(Math.min(5,14)); //5
//        System.out.println(Math.sqrt(81)); //9 kökaltına salma

//        System.out.println(Math.abs(-4)); //4 = mənfini müsbət edir
//        System.out.println(Math.random()); //




    }
}
/*
Verilmiş sətirdə aşağıdakı əməliyyatları yerinə yetirən Java proqramını yazın:

1. Sətirdəki simvolların sayını hesablayın (boşluqlar istisna olmaqla).
2. Sətri böyük hərflərə çevirin.
3. Sətri kiçik hərflərə çevirin.
4. Sətin 'A' hərfi ilə başlayıb-başlamadığını yoxlayın.
5. Sətin 'Z' hərfi ilə bitdiyini yoxlayın.
6. 'e' hərfinin bütün təkrarlarını 'E' ilə əvəz edin.
7. Ayırıcı kimi boşluqlardan istifadə edərək sətri sözlər massivinə bölün.
8. “O” hərfinin ilk dəfə rast gəlinməsinin göstəricisini tapın.
9. 5-ci simvoldan 10-cu simvola (daxil olmaqla) alt sətir çıxarın.
10. Sətirdən hər hansı qabaqcıl və ya arxadakı boşluqları çıxarın.
 */