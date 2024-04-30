package Lesson11.Mentor.HomeWork;

public class CasinoApp {
    public static void main(String[] args) {
        SlotMachine slotMachine = new SlotMachine();
        int slotCount = 3;
        for (int i = 0; i < slotCount; i++) {
            System.out.println("\nAvtomatın qolu çəkilir... (Dəfə " + (i + 1) + ")");
            slotMachine.pullLever();
        }
    }

}
