package Lesson14.Teacher.Video;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Ali";
        person.surname = "Aliyev";
        person.fatherName = "Ahmad";
        person.age = 26;
//        System.out.println(person.name + person.surname);

        person.display(person.name, person.surname);
        System.out.println("0000000000000000000");
        person.display(person.name, person.surname, person.age);
        System.out.println("0000000000000000000");
        person.display(person.name, person.surname, person.fatherName, person.age);

    Work work = new Work();
    work.mission();

    }
}
