package Lesson12.EasyLevel;

public class PersonMain {
    public static void main(String[] args) {
        //sadə encapsulation
//        Person person = new Person(23,"Emin","Panahov",26);
//        person.setId(25);
//
//        System.out.println("ID nömrəsi: " + person.getId());
//        System.out.println("Adı: " + person.getName());
//        System.out.println("Soyadı: " + person.getSurname());
//        System.out.println("Yaşı: " + person.getAge());


//        person.setId(13);
//        person.setName("Enes");
//        person.setSurname("Panahli");
//        person.setAge(13);
//
//        System.out.println("ID: " + person.getId());
//        System.out.println("Adı: " + person.getName());
//        System.out.println("Soyadı: " + person.getSurname());
//        System.out.println("Yaşı: " + person.getAge());

        Person person1 = new Person(23,"Emin","Panahov",26);
        Person person2 = new Person(23,"Emin","Panahov",26);

        System.out.println(person1.equals(person2)); //true
        System.out.println(person1==person2); //false, çünki heap daxilində ayrı-ayrıdılar

        System.out.println(person1.hashCode()); //1092635674
        System.out.println(person2.hashCode()); //1092635674


    }
}
