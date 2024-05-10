package Lesson22.Teacher.Video;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorStudentMain {
    public static void main(String[] args) {
        List<ComparableStudent> comparableStudentList = new ArrayList<>();
        ComparableStudent s1 = new ComparableStudent(1,"Alice", 29);
        ComparableStudent s2 = new ComparableStudent(2,"Bob", 24);
        ComparableStudent s3 = new ComparableStudent(4,"Emin", 29);
        ComparableStudent s4 = new ComparableStudent(3,"Charlie", 25);
        ComparableStudent s5 = new ComparableStudent(5,"Enes", 29);
        comparableStudentList.add(s1);
        comparableStudentList.add(s2);
        comparableStudentList.add(s3);
        comparableStudentList.add(s4);
        comparableStudentList.add(s5);

        //bu sırf list, collection üçündür
        Collections.sort(comparableStudentList, new Comparator<ComparableStudent>() {
            @Override //video 1.50 birdaha baxarsan
            public int compare(ComparableStudent o1, ComparableStudent o2) {
//                return Integer.compare(o2.id,o1.id); //eksine duzdu
                if ((Integer.compare(o1.year,o2.year) != 0)){
                    return Integer.compare(o1.year,o2.year);

                }else {
//                    return o1.name.compareTo(o2.name); //bu yasha gore eynileri bir duzecek
                    return o2.name.compareTo(o1.name); //herflere gore edecek

                }
            }
        });


        for (ComparableStudent comparableStudent : comparableStudentList){
            System.out.println(comparableStudent); //year ardıcıllığına görə çap etdi(id yox)
        }

    }
}
