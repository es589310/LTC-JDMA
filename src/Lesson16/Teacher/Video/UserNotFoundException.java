package Lesson16.Teacher.Video;

public class UserNotFoundException extends Exception{ //RuntimeException da verilsə ildırım işarəsi olacaq

    //Custom Exception

    //bu exception içindəki konstruktoru işə saldı
    public UserNotFoundException(String message) {
        super(message);
    }//burdan yeni exception yaratdıq
}
