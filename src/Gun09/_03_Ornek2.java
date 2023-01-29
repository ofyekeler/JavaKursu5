package Gun09;

import java.util.Scanner;

public class _03_Ornek2 {
    public static void main(String[] args) {

        // Girilen iki sayıdan büyük olanının değerini ekrana yazdırınız.
        // Eşit ise "eşittir" yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("1. Sayı= ");
        int sayi1= oku.nextInt();
        System.out.print("2. Sayı= ");
        int sayi2= oku.nextInt();

        if (sayi1>sayi2) // ise
            System.out.println("Sayı 1 büyüktür.");
        if (sayi1<sayi2) // ise
            System.out.println("Sayı 2 büyüktür.");
        if (sayi1==sayi2) // ise
            System.out.println("Eşittir.");

        /* 1. Sayı= 5
           2. Sayı= 6
           Sayı 2 büyüktür. */

    }
}
