package Gun08;

import java.util.Scanner;

public class _08_Ornek2 {
    public static void main(String[] args) {

        // Girilen bir sayının tek sayı olup olmadığını yazdırınız.

        Scanner oku= new Scanner(System.in);
        System.out.print("Sayı= ");
        int sayi= oku.nextInt();

        int kalan=sayi%2; // bu işlem 1'e eşitse sayı tektir.

        System.out.println("Sayı Tek Mi?= " + (kalan==1));

        /* Sayı= 4
           Sayı Tek Mi?= false */

        // 2. yöntem
        // System.out.println("Sayı Tek Mi?= " + (sayi%2==1));

        // 3. yöntem
        // System.out.println("Sayı Tek Mi?= " + (sayi%2!=0));
        // sayının negatif girilme ihtimaline karşı bu yöntem en doğru yöntemdir.
        // Çünkü 1. ve 2. yöntemle sonuç -1 çıkar.

    }
}
