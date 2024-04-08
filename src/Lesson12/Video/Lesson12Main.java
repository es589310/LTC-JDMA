package Lesson12.Video;

public class Lesson12Main {
    public static void main(String[] args) {
        //encapsulation
   /*
        Lesson12 lesson = new Lesson12(1,"Yusif","Nezerov");
//        lesson.setName("Qəzənfər");
//        lesson.setSurname("Fərəcov");
        lesson.setId(10);
        System.out.println(lesson.getId()); // 0


//        System.out.println(lesson.getName());
//        System.out.println(lesson.getSurname());
//        System.out.println(lesson.getId());
*/
        //    get ve set metodlarini istfiade ederek datani kapsullayaraq encapsulation metodunu yaza bilmeliyik


//        StringPool
        /*
        //intervyu sualı
        String a = "Hello"; //bu heap-in içində String Pull-da yazılır
        String b = "Hello"; //ikinci dəfə eyni dəyər yarananda b məluamtı a kimi eyni yaddaşda saxlıyır
        System.out.println(a == b); //true = verir, çünki b yaddaşda eyni hissədən götürür və ünvanları yoxluyur
        System.out.println(a.equals(b)); // dəyərləri yoxlayaraq true verəcək (Hello)

        String c = new String("Hello"); // bura isə sadəcə Heap-də yazılır
        String d = new String("Hello");
        System.out.println(c.equals(d)); //dəyərlər eyni olduğu üçün true
        System.out.println(c==d); //false verdi, çünki heap daxilində fərqli yerlərdə Hello verdi

        System.out.println(a.equals(c)); //true = dəyərlər eyni
        System.out.println(b==d); //false = ünvanlar fərqli
        */


//    Equals and HashCode methods
        //bu özümüzün yarardığımız equals-dır
        Lesson12 lesson = new Lesson12(1, "Ughur", "Orucov");
        Lesson12 lesson1 = new Lesson12(1, "Ughur", "Orucov");
//        id 1 və başqa rəqəm olsada equals false qaytarır, səbəb fərqli obyektlərdə olmasıdır
//        true qaytarması üçün main olmayan class-da equals and hash code-u override edirik
//        System.out.println(lesson.equals(lesson1));
        //lesson12-də equalsı override etdij və true verdi
//        System.out.println(lesson.equals(lesson)); //metodun ilk sətrindəkinə görə true qaytaracaq

        System.out.println(lesson1.hashCode()); //607446757
        System.out.println(lesson.hashCode());  //607446757
        //equals dəyərlər true-dursa hashcode dəyərlərdə birbirinə bərabərdir

    }
}
