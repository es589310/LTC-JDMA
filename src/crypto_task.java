import java.util.Scanner;

public class crypto_task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sezar;

        System.out.println("Cümle daxil et: ");
        sezar = scan.nextLine();
        char[] sezarShifresi = sezar.toCharArray();

        System.out.println("Reqem daxil edin:");
        int acar = scan.nextInt();

        for (int i = 0; i < sezarShifresi.length; i++) {
            int asciiSirasi = (int) sezarShifresi[i];
            if (asciiSirasi == 32)
                sezarShifresi[i] = ' ';
            else {
                if (asciiSirasi >= 65 && asciiSirasi <= 90) {
                    if ((asciiSirasi + acar) > 90)
                        sezarShifresi[i] = (char) (((asciiSirasi + acar ) % 90) + 64);
                    else
                        sezarShifresi[i] = (char) (asciiSirasi + acar);
                }
                if (asciiSirasi >= 97 && asciiSirasi <= 122) {
                    if ((asciiSirasi + acar) > 122)
                        sezarShifresi[i] = (char) (((asciiSirasi + acar ) % 122) + 96);
                    else
                        sezarShifresi[i] = (char) (asciiSirasi + acar);
                }
            }
        }

        String yeniCumle = String.valueOf(sezarShifresi);
        System.out.println("Shifrelenmish metn: " + yeniCumle);
    }
}
