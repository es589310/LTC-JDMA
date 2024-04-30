package Lesson13.Teacher.NormalLevel.OverrideSuper;

public class Rectangle extends Shape{
    int rightLeft;
    int upDown;

    public Rectangle(int rightLeft, int upDown) {
        this.rightLeft = rightLeft;
        this.upDown = upDown;
    }

    @Override
    public void calculateArea() {
        super.info(); //task3
        int count = (rightLeft * 2) + (upDown *2);
        System.out.println("Düzbucaqlının parametri: " + count + " Sm.");
    }
}
