package Lesson9Mentor.Video;

import java.util.Scanner;

// Kabab sınıfı
class Kabab {
    private String name;
    private double price;

    public Kabab(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }
}

// Meze sınıfı
class Meze {
    private String name;
    private double price;

    public Meze(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }
}

// İçki sınıfı
class Icki {
    private String name;
    private double price;

    public Icki(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }
}

// Menü sınıfı
class Menu {
    private Kabab[] kababs;
    private Meze[] mezes;
    private Icki[] iciki;

    public Menu(Kabab[] kababs, Meze[] mezes, Icki[] iciki) {
        this.kababs = kababs;
        this.mezes = mezes;
        this.iciki = iciki;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Kabab kabab : kababs) {
            totalPrice += kabab.getPrice();
        }
        for (Meze meze : mezes) {
            totalPrice += meze.getPrice();
        }
        for (Icki icki : iciki) {
            totalPrice += icki.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Kabablar:\n");
        for (Kabab kabab : kababs) {
            sb.append(kabab.toString()).append("\n");
        }
        sb.append("Mezeler:\n");
        for (Meze meze : mezes) {
            sb.append(meze.toString()).append("\n");
        }
        sb.append("İçkiler:\n");
        for (Icki icki : iciki) {
            sb.append(icki.toString()).append("\n");
        }
        sb.append("Toplam Fiyat: ").append(calculateTotalPrice());
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kababları oluştur
        Kabab[] kababs = new Kabab[2];
        for (int i = 0; i < kababs.length; i++) {
            System.out.println("Kabab adı: ");
            String name = scanner.nextLine();
            System.out.println("Kabab fiyatı: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // dummy nextLine to clear buffer
            kababs[i] = new Kabab(name, price);
        }

        // Mezeleri oluştur
        Meze[] mezes = new Meze[2];
        for (int i = 0; i < mezes.length; i++) {
            System.out.println("Meze adı: ");
            String name = scanner.nextLine();
            System.out.println("Meze fiyatı: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // dummy nextLine to clear buffer
            mezes[i] = new Meze(name, price);
        }

        // İçkileri oluştur
        Icki[] iciki = new Icki[2];
        for (int i = 0; i < iciki.length; i++) {
            System.out.println("İçki adı: ");
            String name = scanner.nextLine();
            System.out.println("İçki fiyatı: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // dummy nextLine to clear buffer
            iciki[i] = new Icki(name, price);
        }

        // Menüyü oluştur
        Menu menu = new Menu(kababs, mezes, iciki);

        // Toplam fiyatı yazdır
        System.out.println(menu.toString());
    }
}
