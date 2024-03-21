package Lesson8;

public class ClassObjectField {

    //java obyekt yönlü proqramlaşdırma dilidir
//    Scanner scr = new Scanner(System.in);
//    Random rnd = new Random(); //.. məsələn bunlar yeni obyekt yaratmaq üçündür
    // Class ilə hər hansı obyekti öz app-mizə inteqrasiya edirik
    //xüsusiyyətləri field-lər
    //method-lar isə onun behaivour-dur,
        //məsələn pult kodlarını verəndə onun sönməyi, artmağı azalmağı
    //şablonları, xüsusiyyətləri və davranışarı ümumi götürmək üçün class istifadə edirik

    String brand;
    int weigth;
    int height;
    int buttonCount;
    int volume;
    boolean isPower;
    //bunlar Class-mızın field-ləridir

    public int increaseVolume(int volume){
        this.volume++;
        return this.volume;
    }

    //davranışları yəni methodu
    public void onOff(boolean isPower){
        if (this.isPower == true) {
            System.out.println("TV turn on");
        }else {
            System.out.println("TV turn of");
        }
    }


}
