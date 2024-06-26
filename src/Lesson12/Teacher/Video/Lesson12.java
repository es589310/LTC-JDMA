package Lesson12.Teacher.Video;

import java.util.Objects;

public class Lesson12 {
//    Acces Modifared
    /*
    public
      -field-lər hər kəsə açıqdır, fərqli papkalardaki class-dan çəkilən məlumatlarda da public ilə edilir
    default
      -isə yalnız öz papkası daxilində göstərə bilər
    private
      -private vasitəsilə field-lər gizlədilir
    protected
     */

//    long id; //default
//    private String name; //private
//    public String surname; //public

    /*
    OOP
        Encapsulation
        Abstraction
        Inheritence
        Polymorphism
     */
//    Encapsulation
//    class, method və variables bunları bir kapsul daxilində saxlayırıq

    private long id;
    private String name;
    private String surname;
//    get ve set metodlarini istfiade ederek datani kapsullayaraq encapsulation metodunu yaza bilmeliyik


    public Lesson12(long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public long getId() {
        return id;
    }

//    public void setId(long id) {
//        this.id = id;
//    }

    public void setId(long id) {
//        this.id = id;
        if (id == 10){
            this.id = 0;
        }else {
            this.id = id;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    //   override edirik
    //   id 1 və başqa rəqəm olsada equals false qaytarır, səbəb fərqli obyektlərdə olmasıdır
    //   true qaytarması üçün main olmayan class-da equals and hash code-u override edirik
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson12 lesson12 = (Lesson12) o;
        return id == lesson12.id && Objects.equals(name, lesson12.name) && Objects.equals(surname, lesson12.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname);
    }
}

/*
## Obyekt yönümlü proqramlaşdırma (OOP):

Obyekt yönümlü proqramlaşdırma verilənləri modelləşdirmək və manipulyasiya etmək üçün obyektlərdən istifadə edən
 proqramlaşdırma paradiqmasıdır. Java-da hər şey bir obyektdir və OOP əsas anlayışdır. OOP prinsiplərinə
 inkapsulyasiya, irsiyyət və polimorfizm daxildir.

## İnkapsulyasiya:

İnkapsulyasiya OOP-un əsas prinsiplərindən biridir. Bu, verilənlərin (atributların) və həmin verilənlər üzərində
işləyən metodların (funksiyaların) sinif adlanan vahid vahidə yığılmasını əhatə edir. Məqsəd obyektin daxili
vəziyyətinə girişə nəzarət etmək, onu icazəsiz dəyişikliklərdən qorumaqdır.

## Equals və HashCode Metodları:

Java-da bərabərlik üçün iki obyektin məzmununu müqayisə etmək üçün `equals` metodundan istifadə edilir və
`hashCode` metodu obyektin dəyərini əks etdirən tam ədədi qaytarır. Bu üsullar axtarış və məlumatların
saxlanması kimi əməliyyatlar üçün istifadə olunur.


 */