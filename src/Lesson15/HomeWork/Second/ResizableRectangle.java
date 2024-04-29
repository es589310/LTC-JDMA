package Lesson15.HomeWork.Second;

public class ResizableRectangle implements  Resizable{

    double length;
    double width;

    public ResizableRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void resize(double size) {
        length *= size;
        width *= size;
        System.out.printf("Yenilənən düzbucaqlı ətrafları: uzunluq = %.2f, en = %.2f%n", length, width);

    }
}
