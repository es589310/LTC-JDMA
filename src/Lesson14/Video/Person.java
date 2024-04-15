package Lesson14.Video;

public class Person {
//    Polimorfism = çox formalılıqdır
//    bir obyekt üzərindən həm child-dın həmdə parent-dən parametrlərindən əl çatanlığı olur

    String name;
    String surname;
    String fatherName;
    int age;


//    Overload Prosesi

    public void display(String name, String surname){
        System.out.println(name + surname);
    }

//    public void  display(String name, String surname){
//        //bu vəziyyət compile time xətasıdır
         //parametrlər eyni olduğu üçün səhvdir, overload deyil
//    }

    public void  display(String name, String surname,int age){
        System.out.println(name + surname + age);
    }

    public void display(String name,  String surname, String fatherName,int age){
        System.out.println(name + surname + fatherName + age);
    }

    public void mission(){
        System.out.println(name + " mission is unknown ");
    }
}
