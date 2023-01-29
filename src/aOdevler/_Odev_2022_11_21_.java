package aOdevler;

import java.util.Scanner;

public class _Odev_2022_11_21_ {
    public static void main(String[] args) {

        // yan yana aralarında bir boslukla girilen 3 int sayının
        // toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        // 45 67 123

        Scanner oku=new Scanner(System.in);
        System.out.print("3 sayı gir= ");
        String sayilar= oku.nextLine();

        int bosluk1=sayilar.indexOf(" ");
        int bosluk2=sayilar.lastIndexOf(" ");

        String strSayi1=sayilar.substring(0, bosluk1);
        String strSayi2=sayilar.substring(bosluk1+1, bosluk2);
        String strSayi3=sayilar.substring(bosluk2+1);

        int sayi1=Integer.parseInt(strSayi1);
        int sayi2=Integer.parseInt(strSayi2);
        int sayi3=Integer.parseInt(strSayi3);

        int toplam=sayi1+sayi2+sayi3;
        int kalan=toplam%2;

        if (kalan==0)
            System.out.println("Toplamlarının Sonucu Çifttir.");
        else
            System.out.println("Toplamlarının Sonucu Tektir.");

        /* 3 sayı gir= 45 67 123
           Toplamlarının Sonucu Tektir. */

    }
}
