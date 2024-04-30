package Lesson13.Teacher.Video;
//extends ilə bala classı ana classa bağlıyırıq
public class Lesson13Student extends Lesson13 {
    String unversty;
    String faculty;

    public Lesson13Student( String surname, int age, String unversty, String faculty) {
        super( surname, age);
        this.unversty = unversty;
        this.faculty = faculty;
    }

    public Lesson13Student() {
        super();
    }

    //bu override olunma ilə mission metodu dəyişilir,
    //Lesson13-dəki mission ilə bunun arasında artıq fərq olur
    //override olunmuşu görür
    @Override //superclassdaki bir motodun eyni metod və eyni parametr adları ilə tanınması
    public void mission() { //method final olarsa override etmek olmur
        System.out.println(name + "missiyasi kod oxumaqdir.");
        super.test();
    }
}
