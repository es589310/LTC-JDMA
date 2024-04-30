package Lesson8.Mentor.HomeWork;

public class HomeWork {
//    int bigcount = 5;
//    int smallCount = 1;

    public boolean canPack(int bigCount, int smallCount, int goal ){
        // Mövcud unun ümumi çəkisi
        int sumWeight = bigCount * 5 + smallCount;
        // Toplam ağırlığın goal-u qarşıladığını yoxla
        if (sumWeight >= goal) {
            // goal-un tam olaraq qarşılanıb qarşılanmayacağını yoxla
            return goal % 5 <= smallCount;
        }

        //  parametrin neqatif yoxla
        if (bigCount < 0 || smallCount < 0 || goal < 0   ) {
            return false;
        }

        return true;
    }
}
/*
 **bigCount** parametresi büyük un torbalarının (her biri 5 kilo) sayısını temsil eder.

 **smallCount** parametresi küçük un torbalarının (her biri 1 kilo) sayısını temsil eder.

 **goal** parametresi, bir paketin hazırlanması için gereken hedef kilo un miktarını temsil eder.
Bu nedenle, bigCount** ve smallCount kilogramlarının toplamı en azından goal değerine eşit olmalıdır.
Hedef kilo un içeren bir paket yapmak mümkünse, yöntemin return true olması gerekir.

Toplamın goal büyük olması durumunda, hedef tutara ulaşmak için yalnızca dolu çantaların
kullanıldığından emin olun. Örneğin,goal= 9,bigCount= 2 ve smallCount= 0 ise, her büyük çanta
5 kilo olduğundan ve bölünemeyeceğinden yöntemin false döndürmesi gerekir. Ancak,goal= 9,bigCount= 1
ve smallCount= 5 ise,1 full bigCount nedeniyle yöntemin true döndürmesi gerekir çanta
ve 4 dolu smallCount çanta eşittir goal ve fazladan çanta kalması sorun değil.

Parametrelerden herhangi biri negatifse **yanlış değerini döndürür**.
 */