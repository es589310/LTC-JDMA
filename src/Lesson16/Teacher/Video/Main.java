package Lesson16.Teacher.Video;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        //Exception Handling(İstisna ilə işləmə) nədir?
//Proqram daxilində errorların baş verdiyi halda biz onu handle edərək işin davam etməsini təşkil edirik

        //Runtime Exception---- Unchecked Exception
        System.out.println("Start");

//
//        Main1 main1 = new Main1();
//        main1.check(); //belə vəziyyətdə iki seçim verir: try-catch or throws
//        //throws olsa yuxarida metoda throws verir


//    System.out.println(c);
        try {
            String[] name = new String[3];
            name[0] = "Barney";
            name[1] = "Ted";
            name[2] = "Robin";

            System.out.println(name[3]);


            int a = 10;
            int b = 0;

            int c = a / b; //ArithmeticException: / by zero
            System.out.println(c);//əgər b = 4 olarsa
        } catch (ArithmeticException a) {
            System.out.println("0-a bölmək olmaz");
            System.out.println(a.getMessage()); //errorun sebebini göstərir: / by zero
            a.printStackTrace(); //xətanı mesaj xaricində(stopdan sonra) verir, bildirir
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Size doludur");
            System.out.println(a.getMessage()); //errorun sebebini göstərir: Index 3 out of bounds for length 3

//        }catch (Exception a){
//            System.out.println("Xəta baş verdi");
//            System.out.println(a.getMessage());
//            System.err.println(a.getMessage()); //xətanın nə olduğunu birinci qırmızı rəngdə verir
//
//        }


        /*
        ArithmeticException->RuntimeException->Exception->Throwable->Object
        */


            //Compile Time Exception ----- Checked Exception

            //class tapıla bilmədi xətası
//            try {
//                Class.forName("Lesson2.Lesson"); //burda Salam classı olmadığı üçün forName altında compile xətası verir
//            } catch (ClassNotFoundException e) {
////            throw new RuntimeException(e); // bu sadəcə exception verir
//                System.out.println("Lesson adlı Class yoxdur");
//            }


            //file tapıla bilmədi xətası
            try {
                FileReader fileReader = new FileReader("/home/mrdoc/İndirilenler/photo_5206324339799088719_y.jpg");
                //bunun sarısı compiletime exception dur    //əgər adresi yazsaq proqram tapılmamağını çap edəcək
            } catch (FileNotFoundException e) {
                System.out.println("File yoxdu");
            }


            System.out.println("Stop");


        }
    }
}