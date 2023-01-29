package Gun13;

import java.util.Scanner;

public class _05_Ornek3 {
    public static void main(String[] args) {

        // 100 e kadar olan sayıların toplamını bulunuz.

        int sayi=1;
        int toplam=0;
        while (sayi<=100) {
            toplam=toplam+sayi;
            sayi++; // sayac=sayac+1
        }
        System.out.println("100'e Kadar Olan Sayıların Toplamı= " + toplam);

        /* 100'e Kadar Olan Sayıların Toplamı= 5050 */

    }
}
