package Gun10;

import java.util.Scanner;

public class _03_Ornek2 {
    public static void main(String[] args) {

        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı= ");
        int sayi= oku.nextInt();
        int kalan=sayi%2;

        if (kalan==0)
            System.out.println("Çift");
        else // kalan != 0   anlamındadır.
            System.out.println("Tek");

        /* Sayı= 5
           Tek */

    }
}
