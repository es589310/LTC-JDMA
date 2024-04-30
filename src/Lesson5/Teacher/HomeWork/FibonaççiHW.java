package Lesson5.Teacher.HomeWork;

public class FibonaççiHW {
    public static void main(String[] args) {

        System.out.println("Fibonaççi");

        int first = 0; //1,1,2,3,
        int second = 1; //1,2,3,5

        for (int i = 0; i < 10; i++) {
            System.out.print(second + " ");
            int next = first+second;
            first = second;
            second = next;

        }
    }
}
