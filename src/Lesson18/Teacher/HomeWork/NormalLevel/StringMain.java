package Lesson18.Teacher.HomeWork.NormalLevel;

public class StringMain {

    public static void main(String[] args) {
        String words1 = "Allah sənə vermiş gözəlim bir elə göz qaş,\n";
        String words2 = "Bilməmki mələksən ya bəşərsən qalıram çaş.";
        String sentece = words1.concat(words2);
        System.out.println(sentece);

        System.out.println("----------------------------------------------------");

        String subs = sentece.substring(7,39);
        System.out.println("Müəyyən edilən aralıq: " + "'" + subs + "'");

    }
}
