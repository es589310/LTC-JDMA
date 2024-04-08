package Lesson11.HomeWork.NormalLevel;
/*This
    Bu anahtar kelimenin Java'daki amacını açıklayın.
    This anahtar sözcüğünün bir örnek değişken ile aynı ada
    sahip bir yöntem parametresi arasında ayrım yapmak için
    kullanıldığı bir örnek sağlayın
 */
public class This {
    int number;

    public This(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public static void main(StringClass[] args) {
        This num = new This(4);

        num.setNumber(10);

        System.out.println("Number: " + num.getNumber());
    }
}
