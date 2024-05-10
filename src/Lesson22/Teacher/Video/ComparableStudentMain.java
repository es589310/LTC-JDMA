package Lesson22.Teacher.Video;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableStudentMain {
    public static void main(String[] args) {
        List<ComparableStudent> comparableStudentList = new ArrayList<>();
        ComparableStudent s1 = new ComparableStudent(1,"Alice", 25);
        ComparableStudent s2 = new ComparableStudent(2,"Bob", 24);
        ComparableStudent s3 = new ComparableStudent(3,"Charlie", 23);
        ComparableStudent s4 = new ComparableStudent(4,"Emin", 29);
        ComparableStudent s5 = new ComparableStudent(5,"Enes", 29);

        comparableStudentList.add(s1);
        comparableStudentList.add(s2);
        comparableStudentList.add(s3);
        comparableStudentList.add(s4);
        comparableStudentList.add(s5);

//        System.out.println(s1.compareTo(s2));
        //müqayisə etdiyim obyektin yaşı böyükdür ona görə 1 çap edir

//        int i = s4.compareTo(s5);
//        System.out.println(i);
        //ikisidə eyni yaş olduğu üçün 0 çap edir

//        System.out.println(s3.compareTo(s4));
        //müqayisə etdiyim obyektin yaşı kichikdir, ona görə -1 çap edir

        Collections.sort(comparableStudentList);
        for (ComparableStudent comparableStudent : comparableStudentList){
            System.out.println(comparableStudent); //year ardıcıllığına görə çap etdi(id yox)
        }//bu Student tipindedir
        //student -dir
        //studentList-den dovr edecek

    }
}
