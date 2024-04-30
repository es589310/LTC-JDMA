package Lesson16.Teacher.HomeWork.EntertainingLevel;

public class Main{
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("23", "Emin Pənahov", 9000);
        BankAccount account2 = new BankAccount("13", "Enes Pənahlı", 11000);
        try {
            // amountMoney = pul köçürmə
            account1.depositAmount(3050);
            account2.depositAmount(2000);

                System.out.println("-------------------------------------");

            // withdrawAmount = pul çəkmə
            account1.withdrawAmount(1000);
            account2.withdrawAmount(1500);

                System.out.println("-------------------------------------");

            // pul köçürmə
            account1.transferFunds(account2, 400);
            } catch (InsufficientFundsException e) {
                System.out.println("Pul əməliyyatı zamanı problem: " + e.getMessage());
            }

                System.out.println("-------------------------------------");

            System.out.println("\nHesabla bağlı ümumi müddəalar:");
            account1.displayAccountDetails();
                System.out.println("-------------------------------------");
            account2.displayAccountDetails();
    }
}
