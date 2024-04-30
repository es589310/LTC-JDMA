package Lesson10.Teacher.Video;

public class SatckAndHeap {
    //STACK və HEAP
    public static void main(String[] args) {
        //Stack
        int a = 5; //Stack
        int b = 10; //Stack
/*
STack heap-dən sürətlidir
Stack-də primitiv tiplər, class-ların metodları(toString və s.)
Stack LİFO = Last İn First Out məntiqi ilə işləyir
https://www.youtube.com/watch?v=ofGB6PWvIS4
Yığın yaddaşı ibtidai məlumat növlərini və obyektlərə istinadları saxlamaq üçün istifadə olunur. O, "son girən, ilk çıxan" (LIFO) prinsipi ilə işləyir, burada ən son əlavə edilən element ilk çıxarılır.
 */
        //bərabərliyin sol tərəfi Stackdə, sağ tərəfi heap-də yerləşir
            Heap heap = new Heap();
            // heap ---> 91(adres)
            Heap heap1 = new Heap();
            heap1.name = "EEEE";
            // heap1 ----> fa(adres)
//            heap = null; //etsək heap boş qalacaq artıq, onuda Garbage Collector silir içini
            heap = heap1; // birinci heap söndü çünki onun referansı artıq heap1 dəndir

            System.out.println(heap);  //Lesson10.Teacher.Video.Heap@30f39991
            System.out.println(heap1); //Lesson10.Teacher.Video.Heap@452b3a41
/*
Heap çox böyükdü
ancaq çox zəifdi böyük olduğu üçün
FİFO = First in First Out
kassa sırası kimi örnək verilir
birinci girən birinci çıxar
 */

        //Garbage Collector
        System.gc();
        //şübhəli referansı qırılmış obyekt varsa onu yoxlamaqdan ötəri bu kod yazılır


        /*
        Bu nümunədə x, y və nəticə dəyişənləri stack yaddaşında saxlanılır.
         add metodu çağırıldıqda onun a və b parametrləri də stack yaddaşında saxlanılır.
         */
        int x = 5;
        int y = 6;
        int result = add(x,y);
        System.out.println(result);

    }
    public  static int add(int a, int b){
        return a + b;
    }


}
