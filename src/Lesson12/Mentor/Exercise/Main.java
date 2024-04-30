package Lesson12.Mentor.Exercise;

public class Main {
    public static void main(String[] args) {
        Contact person1 = new Contact("Sahil", "+994551234567");
        Contact person2 = new Contact("Sahil", "+994779876543");

//        System.out.println(person1.equals(person2));
//        System.out.println(person1 == person2);
        //ikisidə false

        Contact person3 = new Contact("Emin","+994555555555");
        Contact person4 = new Contact("Sərxan","+994555555555");
//        System.out.println(person3.equals(person4));
//        System.out.println(person3 == person4);
        //ikisidə false

        Contact person5 = new Contact("Şəms","+994555555555");
        Contact person6 = new Contact("Şəms","+994555555555");
        System.out.println(person5.equals(person6)); //true
        System.out.println(person5 == person6);//false





        /*
        **Örnek Kullanım ("main()" yönteminde):**

        - Aynı ada ve farklı numaralara sahip iki Kişiyi karşılaştırın
        - Farklı adlara ve aynı numaraya sahip iki Kişiyi karşılaştırın
        - Aynı isim ve numaraya sahip iki Kişiyi karşılaştırın
         */

    }
}
