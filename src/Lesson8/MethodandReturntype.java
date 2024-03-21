package Lesson8;

public class MethodandReturntype {
    public static void main(String[] args) {
            //istədiyim qədər aşağıdaki methodu çağıra bilərəm, hara? hansısa psvm daxilinə
        //1.VOİD İLƏ
//        newmethod(); // statikdir
//        newmethod(); //9
//        int a = newmethod(); //yazıla bilmir

        //2.İNT İLƏ(statik)
//        int a = methodWithInt(); //isə yazıla bilir
//        System.out.println(a * 2);

        //3.Dinamik dəyər ilə
        int sum = hesabla(13, 23);// burda artıq nəyi hesablayacağını biz müəyyən etdik
        System.out.println(sum);


    }

    //1.VOİD ilə
    // class daxilində method yazırıq
    //public ilə başqa yerlərdəndə çağırmaq olur
    // void ekrana hər hansısa bir şeyi çap etməkdir, bir dəyər qaytarmır hətta return-u yoxdur
    // static-in köməyi ilə newmethod-u çağıracayıq
//    public static void  newmethod(){
//        int a = 5;
//        int b = 4;
//        int c = a + b;
//        System.out.println(c);
//
//    }

    //2.İNT ilə(statik)
    //burda void deyil int kimi tanıdanda artıq mütləq return yazmağımızı istəyir
    //static nümunə ilə
    //parametrsiz metod
//    public static int  methodWithInt(){ //void deyil int yazdıq
//        System.out.println("Salam");
//        int a = 5;
//        int b = 4;
//        int c = a + b;
//        int d = c * 3;
//        return d;
////        return c;
//    }

    //3.Dinamik dəyər ilə
    //indi isə dinamic ilə psvm daxilində dəyişə bilən kod yazaq
    //parametrli metod
    public static int hesabla(int first, int second){
        int netice = first + second;
        return netice;

    }
}
