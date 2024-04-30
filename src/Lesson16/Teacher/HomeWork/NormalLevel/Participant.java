package Lesson16.Teacher.HomeWork.NormalLevel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Participant {
    String name;
    int age;
    String email;

    public Participant(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }


    public static void displayParticipants() {
        try (BufferedReader reader = new BufferedReader(new FileReader("/home/mrdoc/Masaüstü/Java/Participants/"))) {

            System.out.println(reader + " faylı mövcuddur. ");
            if (reader == null) {
                System.out.println("Faylın içi boşdur");
            } else {
                System.out.println("Faylın içi doludur");
            }
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException a) {
            System.out.println("Belə bir fayl yoxdur!  --  " + a.getMessage());
        } catch (IOException a) {
            System.out.println("Fayl oxuna bilmir  --  " + a.getMessage());
        }
    }

    public static void main(String[] args) {
        displayParticipants();

    }

}
