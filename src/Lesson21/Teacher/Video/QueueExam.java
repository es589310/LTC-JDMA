package Lesson21.Teacher.Video;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {
    public static void main(String[] args) {
        //Queue (FIFO)
        //LinkedList Queue ilə List-in ortaq bir implementasiyasıdır
        Queue<String> strings = new LinkedList<>();
//        Queue<String> strings = new ArrayDeque<>(); //LinkdeList-lə eyni işləyir, sadəcə sürət fərqi var
//        strings.offer() //add ile xeta bash verse exception verir, offer ile False qaytarir
        strings.add("Farzali");
        strings.add("Idris");
        strings.add("Vusal");

        System.out.println(strings.peek()); //peek ilk elementi gosterir ancaq chixacaqini demir
//        strings.poll(); //ilk elementi sildi (FIFO)
        System.out.println(strings);


    }
}
