package Lesson13.Mentor.RecordType;

//record ilə fieldləri doldurduq
public record Record(String name, String color) {
    /*
    record tipdə set metodu yoxdur
    private String name;
    private String color;

    public Lesson13(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Lesson13{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    */
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Lesson13 lesson13 = (Lesson13) o;
//        return Objects.equals(name, lesson13.name) && Objects.equals(color, lesson13.color);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, color);
//    }

}
