package Lesson22.Teacher.Video;
//Comparator-da implement etmek ve comapreTo kimi metoda ehtiyac duyulmur
public class ComparatorStudent {
        //Comparator
        int id;
        String name;
        int year;
        public ComparatorStudent(int id, String name, int year) {
            this.id = id;
            this.name = name;
            this.year = year;
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
