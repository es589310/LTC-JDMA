package Lesson16.Teacher.HomeWork.EntertainingLevel;

public class InsufficientFundsException extends Throwable {
    public InsufficientFundsException(String bankMessage) {
        System.out.println(bankMessage);
    }
}
