package Lesson11.Teacher;

public class Lesson11{
    String name;
    int age;

    // Constructor with parameters
    public Lesson11(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Lesson11 person1 = new Lesson11("Alice", 25);
        person1.displayInfo();
    }
}

/*
Konstruktorlar:
Konstruktorlar Java-da sinif obyektlərini işə salmaq üçün istifadə olunan xüsusi metodlardır. Onlar siniflə eyni ada malikdir və qaytarma növü yoxdur. Konstruktorlar sinfin obyekti yaradıldıqda çağırılır. Budur bir nümunə:

bu açar söz:
this açar sözü sinfin cari nümunəsinə istinad etmək üçün istifadə olunur. Tez-tez nümunə dəyişənləri və eyni adlı metod parametrləri arasında fərq qoymaq üçün istifadə olunur. Budur bir nümunə:

String sinfi:
Java-da String sinfi simvollar ardıcıllığını təmsil etmək üçün istifadə olunur. O, Java standart kitabxanasının bir hissəsidir və sətirlərin manipulyasiyası üçün müxtəlif üsulları təmin edir. String sinifindən istifadənin sadə nümunəsi:

 Statik dəyişənlər:
Sinif dəyişənləri kimi də tanınan statik dəyişənlər sinfin bütün nümunələri arasında paylaşılır. Onlar statik açar sözdən istifadə etməklə elan edilir və sinif adından istifadə etməklə daxil olurlar. Budur bir nümunə:

 Metodlar:
Java-da metodlar sinif daxilində müəyyən edilmiş funksiyalardır. Onlar davranışı əhatə edir və xüsusi hərəkətləri yerinə yetirmək üçün çağırıla bilər. Budur bir üsul nümunəsi:


 */

