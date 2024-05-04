package Lesson18.Mentor.Exercises;

public class NickName {
    String name;
    String surname;
    int birthYear;


    public NickName(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public String getNickName() {
        String first = name.substring(0, Math.min(name.length(), 4)).toLowerCase();
        String second = surname.substring(0, Math.min(surname.length(), 5)).toLowerCase();
        String secondFirst = String.valueOf(birthYear).substring(2);

        return first + second + secondFirst + "@gmail.com";

    }

}
