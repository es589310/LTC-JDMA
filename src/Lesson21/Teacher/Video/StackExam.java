package Lesson21.Teacher.Video;

import java.util.Stack;

public class StackExam {
//    Big o notation(qrafik)
//    O(1) - görülən işin böyüklüyündən asılı olmayaraq məs. 1 saniyə cavab qaytarmasıdır
//    O(N) - elementlərin sayı nə qədər çox olsa özüdə o qədər çox olur
//            Arraylist
//    -axtarışda daha sürətlidir: big o notation-u O(1)-dir
//    -əlavə eləmək və silməkdə: big o notation-u O(n)-dir
//            LinkList
//    -əlavə eləmək və silməkdə: big o notation-u O(1)-dir
//    -axtarışda daha sürətlidir: big o notation-u O(n)-dir
    public static void main(String[] args) {
        //Stack Movuzusu
        Stack<String> stanck1 = new Stack<>(); //LIFO prinsipi ilə işləyir
        stanck1.push("Anar");
        stanck1.push("Huseyn");
        stanck1.push("Nesimi");

        stanck1.pop(); // huseyni silir
        stanck1.pop(); // nesimini silir

        //        System.out.println(stanck1.pop()); //ən son elementi alır
        System.out.println(stanck1); //anar qalir


    }



}
