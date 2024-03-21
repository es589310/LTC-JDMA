package Lesson8Mentor;

public class Rectangle {
        //bunlar instance variable həmdə field-dir
        String color = "white";
//        double width;
        double width = 0; // burda default olaraq deyer versekde eyni qalacaq
        double length = 1;
        //bu 3-u field-dir, yeni yaradacaghimiz obyektlerin melumatlari
        //bunlar statikdir

        public double calculateArea(){
         return width*length;
        }
        public void printshape(){
            String name = width == length ? "square" : "rectangle";
            System.out.println(color + " "+name+"has area"+calculateArea()+"sq.metres");
        }
}
