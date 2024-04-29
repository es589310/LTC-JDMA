package Lesson18.Teacher.HomeWork.NormalLevel;

public class StringBufferMain {
    public static void main(String[] args) {
        StringBuffer word4 = new StringBuffer("Zülfün özü tək hali pərişan eliyəndür,\n" +
                                                "Ləli ləbüvün fikri ürək qan eliyəndür,\n" +
                                                "Əndami-lətifün bizi heyran eliyəndür,\n");
        word4.append("Hüsnün gözəlim eşqidə cövlan eliyəndür,\n" +
                "Çatdıqda çatır çatmiyana atdı o bir daş.");
        System.out.println(word4);

    }
}
