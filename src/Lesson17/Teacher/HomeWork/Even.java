package Lesson17.Teacher.HomeWork;

public class Even extends Thread {
    private final Object lock;

    public Even(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            for (int i = 2; i <= 100; i+=2) {
                lock.notify();
                System.out.println(i + " cüt");
                try {
                    lock.wait(500);
                } catch (InterruptedException a) {
                    a.printStackTrace();
                }
            }
        }
    }
}
/*
@Override:
Bu, metodu ezme (override) işlemi olduğunu belirtir. Bu metot, Runnable arayüzünün bir parçası olan run() metodunu ezerek, kendi işlevselliğini tanımlar.
public void run():
Bu metot, bir iş parçacığının ana işlem döngüsünü tanımlar. İş parçacığı başlatıldığında, bu metot çalıştırılır.
synchronized (lock) {:
Bu blok, lock nesnesi üzerinde senkronizasyon sağlar. Yani, bu bloğa yalnızca bir iş parçacığının aynı anda erişmesine izin verilir. Diğer iş parçacıkları bu bloğa erişmek istediklerinde, beklerler.
for (int i = 2; i < 100; i+=2) {:
Bu döngü, 2'den başlayarak 2'şer artan çift sayıları üretir. Yani, 2, 4, 6, ..., 98.
lock.notify();:
Bu satır, lock nesnesini bekleyen diğer iş parçacıklarına bildirim gönderir. wait() metodunu kullanan diğer iş parçacıklarını uyandırır. Ancak, bu bildirim yalnızca o anki iş parçacığına gönderilir, diğer iş parçacıklarına değil.
System.out.println(lock + " cüt");:
Bu satır, mevcut çift sayıyı yazdırır.
lock.wait(500);:
Bu satır, mevcut iş parçacığını 500 milisaniye boyunca bekletir. Bekleme süresi sonunda, diğer iş parçacıklarının notify() çağrılarına tepki vermeye hazır hale gelir. Bu süre sonunda bekleyen iş parçacığı uyanır ve lock üzerindeki kilidi bırakır.
catch (InterruptedException a) { a.printStackTrace(); }:
Bu kısım, wait() metodunun kesintiye uğraması durumunda olası bir hata durumunu ele alır. InterruptedException durumunda, hata mesajını yazdırır.
 */
