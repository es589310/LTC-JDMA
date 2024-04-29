package Lesson18.Teacher.Video;

public class StringMain {
    public static void main(String[] args) {
        String word = "runforestrun";
//        word.toUpperCase();
        //burda sözün hərflərini böyütməyə görə məcbur yeni dəyişəndən istifadə etdik
        String newword = word.toUpperCase();
        System.out.println(newword);
        //ancaq hər dəfə yeni dəyişəndən istifadə etməmək üçün StringBuffer və StringBuild-dən istifadə edəcəyik

        //StringBuilder (immutable)
//        StringBuilder stringBuilder = new StringBuilder("RunForest");
//        stringBuilder.append("Run");
//        System.out.println(stringBuilder); //RunForestRun

        //StringBuffer
        StringBuffer stringBuffer = new StringBuffer("RunForest");
        stringBuffer.append("Run");
        System.out.println(stringBuffer); //RunForestRun

        //String -> string pool-da;
        //StringBuffer and StringBuild -> heap-də yerləşir
        //ikisdə Thread Safe-dir
        //StringBuffer sürət baxımından zəifdir,yaddaş baxımından güclüdür
        //StringBuilder-dən sürət baxımından yaxşıdır,yaddaş baxımından zeifdir

        /*
         StringBuilder:

            'StringBuilder', Java'da değiştirilebilir karakter dizileri sağlayan bir sınıftır.
            İçerik üzerinde birden fazla değişiklik yapmanız gerektiğinde, her işlem için yeni bir
            nesne oluşturmadığından 'String'den daha verimlidir.

         StringBuffer:

            'StringBuffer', 'StringBuilder'a benzer, ancak senkronize edilmiştir, bu da onu iş parçacığı
             açısından güvenli kılar. Birden fazla iş parçacığının aynı anda içeriği değiştirmeye çalışabildiği
             çok iş parçacıklı bir ortamda, 'StringBuffer' aynı anda yalnızca bir iş parçacığının nesneye
             erişebilmesini sağlar.

             ### Müqayisə:

                - **String:** Dəyişməz, birləşmə əməliyyatları üçün yaddaşdan daha az səmərəlidir.
                - **StringBuilder:** Dəyişən, tək yivli mühitdə birləşmə üçün daha səmərəlidir.
                - **StringBuffer:** Dəyişən və mövzu üçün təhlükəsizdir, çox yivli mühitlər üçün uyğundur,
                                    lakin tək yivli kontekstdə `StringBuilder`-dən daha az performans göstərə bilər.

             ### Xülasə:

                - Dəyişməz simvol ardıcıllığına ehtiyacınız olduqda `String` istifadə edin.
                - Tək yivli mühitdə dəyişən simvol ardıcıllığına ehtiyacınız olduqda `StringBuilder` istifadə edin.
                - Çox yivli mühitdə dəyişən və iplə təhlükəsiz simvol ardıcıllığına ehtiyacınız
                  olduqda `StringBuffer` istifadə edin.



         */

    }
}
