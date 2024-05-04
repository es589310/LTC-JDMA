package Lesson19.Mentor.Exercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputValidator validator = new InputValidator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hər hansı bir şey yazın, proqramdan çıxmaq istəsəniz 'exit'-dən istifadə edinş.");
        String input;
        while (!(input = scanner.nextLine()).equalsIgnoreCase("exit")) {
            InputCategory category = validator.categoriInput(input);
            if (category != null) {
                System.out.println(input + "  -  '" + category.getCategory() + "'");
            } else {
                System.out.println("Belə bir kateqoriya yoxdu '" + input + "'");
            }

}
    }
}
