package Lesson20.Mentor.HomeWork;

import java.util.ArrayList;
import java.util.List;

class SpotifyPlaylist<T extends Playable> {
    private List<T> list;

    public SpotifyPlaylist(List<T> list) {
        this.list = list;
    }

    public SpotifyPlaylist() {
        this.list = new ArrayList<>();
    }

    public void addToList(T playable) {
        list.add(playable);
    }

    public void printDetails() {
        for (T item : list) {
            System.out.println(item.getDetails());
        }
    }
}