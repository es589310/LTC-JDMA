package Lesson22.Teacher.Video;
//Comparable və Comparator müqayisə xarakterlidir
//Compare üçün: implementasiya etməliyik, compareTo metodu override olmalı və içərisi müqayisəyə görə müəyyən olunmalıdı
//Comparable da her shey eyni classin terkibinde yazilir
public class ComparableStudent implements Comparable<ComparableStudent>{
    //Comparable = interface-dir
    int id;
    String name;
    int year;
    public ComparableStudent(int id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    @Override
    public int compareTo(ComparableStudent o){
//        return Integer.compare(this.year, o.year); //bu class-daki year ile o-nun yearini muqayise edirik
//        return Integer.compare(o.year,this.year ); //yerlerin deyishdik, tostring chapi azalan siraya gore edecel
        //chunki muqayise yeri deyishdi
//        return this.year - o.year; //bu yazılışda keçərlidir
    return this.name.compareTo(o.name); //adlara gore siralandi,A-dan E-ye
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
