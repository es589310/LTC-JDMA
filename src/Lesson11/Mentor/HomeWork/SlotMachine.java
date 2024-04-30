package Lesson11.Mentor.HomeWork;

import java.util.Random;

public class SlotMachine {
    public static final String[] SYMBOLS = {"🍒", "🍋", "🍊", "🔔", "🍉", "🍇"};
    public static final int SYMBOL_COUNT = SYMBOLS.length;
    public Random random;

    public SlotMachine() {
        random = new Random();
    }

    public void pullLever() {
        String[] result = new String[3];
        for (int i = 0; i < 3; i++) {
            result[i] = SYMBOLS[random.nextInt(SYMBOL_COUNT)];
        }
        displaySymbols(result);
        checkWin(result);
    }

    private void displaySymbols(String[] symbols) {
        System.out.println("Nəticə: " + symbols[0] + " | " + symbols[1] + " | " + symbols[2]);
    }

    private void checkWin(String[] symbols) {
        if (symbols[0].equals(symbols[1]) && symbols[1].equals(symbols[2])) {
            System.out.println("Təbriklər! Qazandın!");
        } else {
            System.out.println("Təssüfki uduzdun. Şansını bir daha sına!");
        }
    }


}
