package Lesson14.NormalLevel.MathOperationsOverload;

public class Main {
    public static void main(String[] args) {
        MathOperations calculate = new MathOperations();
        calculate.operations(5,5);
        calculate.operations(25,10.0);
        calculate.operations(2.5,5);
        calculate.operations(10.0,5.0);
    }
}
