package Lesson20.Mentor.HomeWork;

public class Meykhana implements Music{
    String title;
    String artist;
    int duration;

    public Meykhana(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String getDetails() {
        return "Meyxana: " + title + " müəllifi " + artist + ", Vaxt: " + duration + " saniyə";

    }
}
