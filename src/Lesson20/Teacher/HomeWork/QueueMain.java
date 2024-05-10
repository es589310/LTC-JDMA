package Lesson20.Teacher.HomeWork;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<String> queueTask = new LinkedList<>();
        System.out.println("ATM qarşısında 5 nəfər var..");
        queueTask.add("1-ci adam");
        queueTask.add("2-ci adam");
        queueTask.add("3-cü adam");
        queueTask.add("4-cü adam");
        queueTask.add("5-ci adam");
        System.out.println(queueTask);



        String firstRemove = queueTask.remove();
        System.out.println(firstRemove + " pulunu çəkib getdi.");

//        String peek = queueTask.peek();
//        System.out.println(peek);

        System.out.println("Qalan insanlar:");
        for (String element : queueTask) {
            System.out.println(element);
        }



    }
}
