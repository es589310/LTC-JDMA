package Lesson20.Mentor.HomeWork;

public class Rock implements Music{
    String title;
    String artist;
    int duration;

    public Rock(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String getDetails() {
        return "Rock: " + title + " müəllifi " + artist + ", Vaxt: " + duration + " saniyə";

    }
}
