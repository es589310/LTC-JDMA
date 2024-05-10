package Lesson20.Mentor.HomeWork;


public class MainPlaylist {
    public static void main(String[] args) {
        SpotifyPlaylist<Music> musicPlaylist = new SpotifyPlaylist<>();
        POP popSong = new POP("Yoksun", "Ebru Yaşar", 180);
        POP popSong1 = new POP("Kəpənəklər", "Hiss", 180);
        POP popSong2 = new POP("Sevdim", "Hiss", 180);
        Rock rockSong = new Rock("Şeytan Bunun Neresinde", "Pentagram", 240);
        Rock rockSong1 = new Rock("Yandırdın Qəlbimi", "Milan", 186);
        Rock rockSong2 = new Rock("Aldatdın Məni Sən", "Yuxu", 291);
        Meykhana meykhanaSong = new Meykhana("Hovsan Toyu", "Perviz", 200);
        Meykhana meykhanaSong1 = new Meykhana("CANANIMSAN MEYXANA HOVSAN toyu", "Perviz Super deyisme Resad Super Meyxana Aydin Super Qafiye", 200);
        Meykhana meykhanaSong2 = new Meykhana("MEYXANA Rahimin oglunun toyu", "Super Muzikalni Resad Orxan Vuqar", 200);

        musicPlaylist.addToList(popSong);
        musicPlaylist.addToList(popSong1);
        musicPlaylist.addToList(popSong2);

        musicPlaylist.addToList(rockSong);
        musicPlaylist.addToList(rockSong1);
        musicPlaylist.addToList(rockSong2);

        musicPlaylist.addToList(meykhanaSong);
        musicPlaylist.addToList(meykhanaSong1);
        musicPlaylist.addToList(meykhanaSong2);

        System.out.println("Playlist`im:");
        musicPlaylist.printDetails();

    }
}
