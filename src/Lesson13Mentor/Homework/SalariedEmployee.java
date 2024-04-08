package Lesson13Mentor.Homework;

public class SalariedEmployee extends Employee{
    double annualSalary;
    public SalariedEmployee(String name, String birthDate, String endOfContract, long employeeId, String hireDate, double annualSalary) {
        super(name, birthDate, endOfContract, employeeId, hireDate);
        this.annualSalary = annualSalary;
    }

    
}
