package Lesson8;

public class BankMain {
    public static void main(String[] args) {
        BankAccount accountcash = new BankAccount("1234 5678 9012 3456",1000);
        System.out.println("Bank nömrəsi: " + accountcash.accountNumber());
        System.out.println("Hesabda olan miqdar: " + accountcash.balance() + " azn.");
//        accountcash.accountNumber();
        accountcash.deposit(100);
        accountcash.cashDraw(50);


    }
}
