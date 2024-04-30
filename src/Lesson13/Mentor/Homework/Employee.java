package Lesson13.Mentor.Homework;

public class Employee extends Worker{
    String hireDate;
    long employeeId;

    public Employee(String name, String birthDate, String endOfContract, long employeeId, String hireDate) {
        super(name, birthDate, endOfContract);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }


    @Override
    public void retire() {
        super.retire();
        System.out.println("Maaşla işləyən:" + getMonthlySalary());
        System.out.println("Saatla işləyən:" + getMonthlySalary());

    }

    public double getMonthlySalary(){
        return 0;
    }
}
