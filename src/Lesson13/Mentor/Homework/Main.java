package Lesson13.Mentor.Homework;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Ali Cabbar", "14.02.1997", "02.04.2019", 699, "01.08.2025", 40000);
        System.out.println("Adı: " + salariedEmployee.name);
        System.out.println("Aylıq Maaşı: " + salariedEmployee.getMonthlySalary());
        salariedEmployee.retire();
        System.out.println();

        // HourlyEmployee
//        HourlyEmployee hourlyEmployee = new HourlyEmployee("Vəli Hacıyev", "25.05.1995", "01.09.2020", 456, "01.08.2025", 20);
//        System.out.println("Adı: " + hourlyEmployee.name);
//        System.out.println("Aylıq Maaşı: " + hourlyEmployee.getMonthlySalary());
//        hourlyEmployee.retire();
    }
}
