package Gun12;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {

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

        // merdivenli if, yani "if else if"
        // sout içinde yazdırmak istersek:
        // "?" "öyleyse(if)" demek, ":" ise "değilse(else)" demek

        if (secim.equalsIgnoreCase("T"))
            System.out.println("Toplamı= " + (s1+s2));
        else
            if (secim.equalsIgnoreCase("Ç"))
                System.out.println("Farkı= " + (s1 - s2));
            else
                if (secim.equalsIgnoreCase("P"))
                    System.out.println("Çarpımı= " + (s1*s2));
                else
                    if (secim.equalsIgnoreCase("B"))
                        System.out.println("Bölümü= " + (s1/s2));
                    else
                        System.out.println("Yanlış seçim");

        /* 1. Sayı= 12
           2. Sayı= 6
           Toplama için T
           Çıkartma için Ç
           Çarpma için P
           Bölme için B
           Seçiminiz= p
           Çarpımı= 72 */

    }
}
