package Lesson13.Teacher.Video;

public class Lesson13 {
//    public final class Lesson13 == olarsa error verecek artiq o parent olmayacaq
    //Inheritence = varislik, miras almaq
    /*
    Superclass və sub class, parent class və child class
        Superclass və parent class hər şeyin törədildiyi yerdir
        sub class və child class isə hər şeyin qəbul elədiyi classdır
    Biz inheritence yazaraq təkrarçılığın qarşısını alır
    Lesson13,Lesson13Student və Employee hərəsi başqa başqa obyektlərdi
*/
        final String name="Emin"; //əgər bir field final dırsa onun dəyəri sonradan dəyişə bilməz
        String surname;
        int age;

    public Lesson13(String surname, int age) {
//        this.name = name; //bu fieldə final oxutduğum üçün bu konstruktor onu tanımır
        this.surname = surname;
        this.age = age;
        System.out.println("Lesson13-un dolu konstruktoru");
    }

    public Lesson13() {
        System.out.println("Bosh konstruktor");
    }


//    public final void mission == method final olarsa override etmek olmur
    public void mission(){
            System.out.println(name + " misson is unknown");
        }
//    @Override child clasinda olur ve superclassdaki bir metodun eyni metod və eyni parametr adları ilə tanınması

    public void test(){
        System.out.println("Kodu oxuyub alqoritmani qavramalidir");
    }

    /*
    Intervyu sualı:
        Bir class-ı immutable etmək üçün nə edə bilərik?
        -ilk növbədə həmən class final edirik
        -fieldləri final edirik
        -setMethod-larını yığışdırırıq
        -metodu final edirik
     */
}
