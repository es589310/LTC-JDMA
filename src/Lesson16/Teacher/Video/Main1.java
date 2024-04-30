package Lesson16.Teacher.Video;

public class Main1 {
    //Throws
    //metoda yazilir
    // iki seçim verir ya try-catch edirik yada throws
    public void check() throws ClassNotFoundException{
        Class.forName("Lesson2.Lesson");
    }
}
