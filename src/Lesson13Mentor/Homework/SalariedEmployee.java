package Lesson13Mentor.Homework;

public class SalariedEmployee extends Employee{
    double yearSalary;
    public SalariedEmployee(String name, String birthDate, String endOfContract,long employeeId , String hireDate, double yearSalary) {
        super(name, birthDate, endOfContract, employeeId, hireDate);
        this.yearSalary = yearSalary;
    }

    @Override
    public double getMonthlySalary() {
        return yearSalary / 12;

    }


}
