package Gun12;

import java.util.Scanner;

public class _05_Ornek2 {
    public static void main(String[] args) {

        // _02_IfElseIf deki bu soruyu "Switch" ile çözünüz.

        // Girilen iki tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, çıkartma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanıcıdan alarak isteğe uygun olan işlemi yaptırıp
        // sonucunu yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("1. Sayı= ");
        int s1= oku.nextInt();

        System.out.print("2. Sayı= ");
        int s2= oku.nextInt();

        System.out.println("Toplama için T");
        System.out.println("Çıkartma için Ç");
        System.out.println("Çarpma için P");
        System.out.println("Bölme için B");

        Scanner okuStr=new Scanner(System.in);
        System.out.print("Seçiminiz= ");
        String secim=okuStr.next();

        switch (secim.toUpperCase()) {
            case "T": System.out.println("Toplama= " + (s1 + s2)); break;
            case "Ç": System.out.println("Çıkarma= " + (s1 - s2)); break;
            case "P": System.out.println("Çarpma= " + (s1 * s2)); break;
            case "B": System.out.println("Bölme= " + ((double)s1 / s2)); break;

        /* 1. Sayı= 5
           2. Sayı= 6
           Seçiminiz= P
           Çarpma= 30 */

        }
    }
}
