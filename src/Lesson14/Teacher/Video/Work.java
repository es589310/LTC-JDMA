package Lesson14.Teacher.Video;

public class Work extends Person{
    private String companyName;
//    Run Time Polimorfizm = Override
    @Override
    public void mission() {
        System.out.println("Worker mission is worker");
    }
}
