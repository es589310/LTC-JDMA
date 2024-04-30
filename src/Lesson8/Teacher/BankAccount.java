package Lesson8.Teacher;

public class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNum, double balance1){
        accountNumber = accountNum;
        balance = balance1;
    }
    public String accountNumber(){
        return accountNumber;
    }
    public double balance(){
        return balance;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println(amount + " azn əlavə edildi. Hal hazırdaki balans: " + balance + " azn.");
    }
    public void cashDraw(double amount){
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " azn. balansdan götürüldü. Mövcud balansınız: " + balance + " azn.");
        }else {
            System.out.println(balance + " azn. - balansınızda yetərli pul yoxdur");
        }
    }

}

/*
ilk öncə accountnumber və balance adında iki özel değişken tanımlanıyor.
Yeni bir BankaHesabi nesnesi oluşturulduğunda bu metod otomatik olarak çağrılır.
    -Parametre olarak hesap numarası (accountNum) ve başlangıç bakiyesi (balance1) alır.
Sonra, parametre olarak alınan değerler sınıfın özelliklerine atanıyor.
Bu metot, accountNumber özelliğinin değerini döndürür.
    Hesap numarası değerini döndüren satır.
Bakiyeyi döndüren bir metot tanımlanıyor. Bu metot, balance özelliğinin değerini döndürür.
    Bakiye değerini döndüren satır.
Para yatırma işlemini gerçekleştiren bir metot tanımlanıyor. Bu metot deposit, parametre olarak aldığı miktarı bakiyeye ekler.
    Para yatırma işlemini gerçekleştiren satırlar.
    İlk olarak, amount balance-ye eklenir, ardından yeni balance değeri ekrana yazdırılır.
Para çekme işlemini gerçekleştiren bir metot tanımlanıyor. Bu metot cahsDraw, parametre olarak aldığı miktarı bakiyeden çıkarır.
    Para çekme işlemini gerçekleştiren satırlar.
    İlk olarak, balance ile amount karşılaştırılır.
    Eğer balance amount-dan büyük veya eşitse, çekilen miktar balance-den düşülür ve
        yeni balance ekrana yazdırılır. Aksi halde, yetersiz balance mesajı ekrana yazdırılır.

Test amaçlı kullanılan bir main metodu tanımlanıyor.
BankAccount clasında bir obyekt oluşturuluyor. Yeni obyekt, "1234567890" hesap numarası ve 1000.0 TL başlangıç bakiyesi ile oluşturulur.
main metodu, sınıfın test edilmesi için kullanılır.
 Bu metot, bir BankaHesabi nesnesi oluşturur, başlangıç balance
 ve hesap numarasıyla birlikte. Ardından, hesap numarası ve
 başlangıç bakiyesi ekrana yazdırılır. Daha sonra, para yatırma ve
 para çekme işlemleri gerçekleştirilir ve sonuçlar ekrana yazdırılır.

 */
