package Lesson13.Mentor.Exercise;

public class Main {
    public static void main(String[] args) {
//        Product computer = new Product("Lenovo","ThinkPad");
////        computer.getInfo();
        CPU cpu1 = new CPU("Lenovo","ThinkPad",3,3.5);
//        cpu1.process();
        GPU gpu1 = new GPU("Lenovo","ThinkPad",6);
//        gpu1.render();
        Laptop lap = new Laptop("Lenovo","ThinkPad",cpu1,gpu1);
        lap.start();
    }
}
