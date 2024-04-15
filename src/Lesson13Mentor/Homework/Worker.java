package Lesson13Mentor.Homework;

public class Worker {
    String name;
    String birthDate;
    String endOfContract;

    public Worker(String name, String birthDate, String endOfContract) {
        this.name = name;
        this.birthDate = birthDate;
        this.endOfContract = endOfContract;
    }

    public void retire(){
        System.out.println(name + " bəyin (doğum tarixi " +birthDate+")" + " kontraktın sonudur" + endOfContract);

    }
}
