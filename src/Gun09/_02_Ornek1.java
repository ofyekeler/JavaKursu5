package Gun09;

import java.util.Scanner;

public class _02_Ornek1 {
    public static void main(String[] args) {

        // Girilen bir sayının negatif mi, pozitif mi olduğunu yazdırınız
        // Sıfır ise sıfır yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı= ");
        int sayi = oku.nextInt();

        if (sayi > 0) // ise

            System.out.print("Sayı Pozitif");

        if (sayi < 0) // ise

            System.out.print("Sayı Negatiftir");

        if (sayi == 0) // "eşittir" yerine "eşit mi" yani "==" dememiz lazım.

            System.out.print("Sayı 0'dır");

        /* Sayı= 1
           Sayı Pozitif
           Sayı= -1
           Sayı Negatiftir
           Sayı= 0
           Sayı 0'dır */

    }
}
