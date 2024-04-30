package Lesson11.Teacher.HomeWork.NormalLevel;

public class BankAccount {
    public static int totalAccounts = 0;

    public BankAccount() {

        totalAccounts++;
    }

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        System.out.println("Bank hesabları: " + BankAccount.totalAccounts);

    }
}



/*
**Konu: Statik Değişkenler**

1. Oluşturulan toplam banka hesabı sayısını takip etmek için
* "totalAccounts" statik değişkenine sahip "BankAccount"
*  adında bir Java sınıfı oluşturun.
*  Sınıf için, her yeni hesap oluşturulduğunda bu değişkeni
* artıran bir kurucu yazın. İki "BankaHesabı" nesnesi oluşturun ve
*  toplam hesap sayısını görüntüleyin.
 */