package Lesson13Mentor.Homework;

public class HourlyEmployee extends Employee{
    double hourlySalary;
    public HourlyEmployee(String name, String birthDate, String endOfContract, long employeeId, String hireDate,double hourlySalary) {
        super(name, birthDate, endOfContract, employeeId, hireDate);
        this.hourlySalary = hourlySalary;
    }
}
