package Lesson13Mentor.Homework;

public class Employee extends Worker{
    long employeeId;
    String hireDate;

    public Employee(String name, String birthDate, String endOfContract,long employeeId,String hireDate) {
        super(name, birthDate, endOfContract);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
//        System.out.println("İşçinin vəsiqəsi " + employeeId + " və " + "iş üçün kiralanma tarixi " + hireDate);
    }

    @Override
    public void retire() {
        super.retire();
    }
}
