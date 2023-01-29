package Gun10;

import java.util.Scanner;

public class _08_Ornek6 {
    public static void main(String[] args) {

        //_Odev_2022_11_21_ in kısa çözümü.
        // yan yana aralarında bir boslukla girilen 3 int sayının
        // toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        // 45 67 123

        Scanner oku=new Scanner(System.in);
        System.out.print("3 sayı gir= ");
        String sayilar= oku.nextLine();

        int sayi1=Integer.parseInt(sayilar.substring(0, sayilar.indexOf(" ")));
        int sayi2=Integer.parseInt(sayilar.substring(sayilar.indexOf(" ")+1, sayilar.lastIndexOf(" ")));
        int sayi3=Integer.parseInt(sayilar.substring(sayilar.lastIndexOf(" ")+1));

        if ((sayi1+sayi2+sayi3)%2==0)
            System.out.println("Toplamlarının Sonucu Çifttir.");
        else
            System.out.println("Toplamlarının Sonucu Tektir.");

        /* 3 sayı gir= 45 67 123
           Toplamlarının Sonucu Tektir. */

    }
}
