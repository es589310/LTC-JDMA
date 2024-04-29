package Lesson16.HomeWork.EntertainingLevel;

public class BankAccount {
    private String accountNumber;
    private String accountHolder; //holder = sahib
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    //InsufficientFundsException = Qeyri Kafi vəsait istisnası
    public void depositAmount(double amountMoney) {
        balance += amountMoney;
        System.out.println("Hesaba " + amountMoney + " AZN. əlavə olundu. Yeni hesab: " + balance + " AZN.");
    }

    public void withdrawAmount(double amountMoney) throws InsufficientFundsException {
        if (balance >= amountMoney) {
            balance -= amountMoney;
            System.out.println("Hesabdan " + amountMoney + " AZN. pul çəkildi. Yeni hesab: " + balance + " AZN.");
        } else {
            throw new InsufficientFundsException("Hesabınızda yetəri qədər pul yoxdur!");
        }
    }

    public void transferFunds(BankAccount moneyTaker, double amountMoney) throws InsufficientFundsException {
        if (balance >= amountMoney) {
            withdrawAmount(amountMoney);
            moneyTaker.depositAmount(amountMoney);
            System.out.println(amountMoney + " AZN. " + moneyTaker.accountHolder + " kart hesabına göndərildi.");
        } else {
            throw new InsufficientFundsException("Hesabınızda yetəri qədər pul yoxdur!");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Hesab nömrəsi: " + accountNumber);
        System.out.println("Hesabın sahibi: " + accountHolder);
        System.out.println("Mövcud pul: " + balance + " AZN.");
    }
}
