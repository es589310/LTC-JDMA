package Lesson13Mentor.Homework;

public class HourlyEmployee extends Employee{
    double hourlySalary;
    private final int hoursWeek = 30; // final metodu

    public HourlyEmployee(String name, String birthDate, String hireDate, long employeeId,  String endOfContract, double hourlySalary) {
        super(name, birthDate, hireDate, employeeId, endOfContract);
        this.hourlySalary = hourlySalary;
    }
    @Override
    public double getMonthlySalary() {
        return hourlySalary * hoursWeek * 4;
    }
}
