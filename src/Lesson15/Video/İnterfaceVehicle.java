package Lesson15.Video;

public interface İnterfaceVehicle {
    static String name = "Emin"; //field sadece static ile deyeri teyin olunur, constructorda ona gore yaradila bilmir
    double odoHesabla(double odo);
//    Java8-e qeder interface tərkibində yalnız body-si olmayan metodlar yazılırdı
// public abstract double odoHesabla(double odo); - interface bilirki public abstract default olaraq bunun qarşısında olur

//    Java8-den sonra isə interface tərkibində body-si olan metodlar artıq yazıla bilir
    static void info(){
        System.out.println("Static ile.");
    } // static ilə yaza bilirik (java8 den sonra)

    default void infoRelax(){
        System.out.println("Default ile");
    }// default ile(java8 den sonra)
//*İnterface-lərin constructoru olmur
//*Bir neçə class-ı bir neçə interface implement edə bilir, ancaq yalnız bir class extend edə bilər
//*Abstract class-larda constructor olur, interface classda olmur
//*İnterface interface-dən extend edə bilər
//*Abstracda fieldlər normal verilə bilir, ancaq interface-də static olaraq təyin olunub dəyər verərək bildirilir

//    public void odoHesabla(double void){
//

//    } bu zaman error verir
}
