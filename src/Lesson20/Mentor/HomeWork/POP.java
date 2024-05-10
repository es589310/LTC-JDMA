package Lesson20.Mentor.HomeWork;

public class POP implements Music{
    String title;
    String artist;
    int duration;

    public POP(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String getDetails() {

        return "Pop: " + title + " müəllifi " + artist + ", Vaxt: " + duration + " saniyə";



    }
}
