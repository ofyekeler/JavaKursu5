package Gun10;

import java.util.Scanner;

public class _02_Ornek1 {
    public static void main(String[] args) {

        // Girilen  vize (50) ve final (50) notunu okuyarak ortalamayı bulunuz.
        // ortalama 60 dan büyük-eşit ise "geçtiniz, tebrikler" yazdırınız,
        // değilse "bütünlemeye kaldınız" şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Vize Notu= ");
        int vizeNotu= oku.nextInt();
        System.out.print("Final Notu= ");
        int finalNotu=oku.nextInt();

        double ort=(double) (vizeNotu+finalNotu)/2;
        // ya da    double ort=(vizeNotu+finalNotu)/2.0;
        // int ten double çevirdim. Ortalama virgüllü çıkabilir.

        System.out.println("Ortalama= " + ort);

        if (ort>=60)
            System.out.println("Geçtiniz, tebrikler");
        else
            System.out.println("Bütünlemeye Kaldınız");

        /* Vize Notu= 61
           Final Notu= 62
           Ortalama= 61.5
           Geçtiniz, tebrikler */

    }
}
