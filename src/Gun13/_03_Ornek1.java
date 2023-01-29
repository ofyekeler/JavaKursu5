package Gun13;

import java.util.Scanner;

public class _03_Ornek1 {
    public static void main(String[] args) {

        // Girilen 5 sayının toplamının sonucunu yazdırınız.

        Scanner oku = new Scanner(System.in);

        int sayac=1;
        int toplam=0;
        while (sayac<=5) {
            System.out.print(sayac+". "+"Sayıyı Giriniz= ");
            int sayi = oku.nextInt();
            toplam=toplam+sayi;
            sayac++; // sayac=sayac+1
        }
        System.out.println("Sayıların Toplamı = " + toplam);

        /* 1. Sayıyı Giriniz= 1
           2. Sayıyı Giriniz= 2
           3. Sayıyı Giriniz= 5
           4. Sayıyı Giriniz= 6
           5. Sayıyı Giriniz= 8
           Sayıların Toplamı = 22 */

    }
}
