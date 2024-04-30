package Lesson15.Teacher.Video;

public abstract class Vehicle {
//*Abstract class body-siz  metod və class yazılır
    String name; //field normal verile bilir
//    class-la bərabər metoduda abstract etməliyik
//    heç vaxt içi private ola bilməz
    public abstract double calculateOdo(double odo);
//    əsas class-da body factorunu çıxarırıq, yəni {}-nın daxilindəkiləri

//bala classlardakı anaclass-dan override olunmuş metodun içindən çağrılmasına,
// qırağ bir klass-dan çağırılmasına abstraction deyilir


//*Abstract class-da həmdə body ilə metod yazıla bilir
    public void info(){
        System.out.println("Odoları hesablamaq..");
    }
//    bu bala class-larda override tələb etmiyəcək
//    başqa yoluda main classında bu bala classdan info metodunu çağıra biləcəyimizdi


//*Abstract classın constructoru ola bilər
//*Inheritance-ye gore bir class başqa classları extend edir
//*Abstract class-larin obyektini yaratmaq mümkündür ancaq düzgün deyil, düzgün olmayan main classında override edərək verir
}
