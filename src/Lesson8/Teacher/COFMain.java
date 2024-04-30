package Lesson8.Teacher;

public class COFMain {
    public static void main(String[] args) {
        //clasın adını qeyd edirik
        //samsung obyekti
        ClassObjectField samsung = new ClassObjectField();
        samsung.brand = "Samsung";
        samsung.weigth = 24;
        samsung.height = 20;
        samsung.isPower = true;
        samsung.volume = 12;

        int i = samsung.increaseVolume(samsung.volume);
        System.out.println(i);

        samsung.onOff(samsung.isPower);

        //lg obyekti
        ClassObjectField lg = new ClassObjectField();
        lg.volume = 18;
        lg.isPower = false;
        lg.height = 30;
        System.out.println(lg.volume);


//        ClassObjectField lg = new ClassObjectField();
    }
}
