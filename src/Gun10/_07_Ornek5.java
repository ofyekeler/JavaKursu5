package Gun10;

import java.util.Scanner;

public class _07_Ornek5 {
    public static void main(String[] args) {

        // yan yana aralarında bir boşluk girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz. (45 67) gibi

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayıları Bir Boşluk Bırakarak Giriniz= ");
        String sayilar= oku.nextLine();
        int boslukindex=sayilar.indexOf(" ");
        String strSayi1=sayilar.substring(0, boslukindex);
        String strSayi2=sayilar.substring(boslukindex+1);
                                            // boşluktan sonraki tüm indexleri alır.
        int sayi1=Integer.parseInt(strSayi1);
        int sayi2=Integer.parseInt(strSayi2);
        if (sayi1==sayi2)
            System.out.println("Eşittir");
        else
            System.out.println("Eşit Değildir");

        /* Sayıları Bir Boşluk Bırakarak Giriniz= 10 11
           Eşit Değildir
           Sayıları Bir Boşluk Bırakarak Giriniz= 20 20
           Eşittir */

    }
}
