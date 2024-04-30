package Lesson11.Teacher.HomeWork.Entertaining;

class Animal {
    String name;
    String species;
    int age;
    static int totalVisitors = 0;
    String sounds;

    public Animal(String name, String species, int age,String sounds) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.sounds = sounds;
        totalVisitors++;
    }


    public void displayİnfo(){
        System.out.println("Hansı heyvan: " + name + ", " + species + ", "+ age + " yaşında.");
    }
    public void makeSound() {

        System.out.println(name + " çıxardığı səslər: " + sounds);
    }

    public static int getTotalVisitors() {
        return totalVisitors;
    }
    public String getName(){
        return name;
    }
}
