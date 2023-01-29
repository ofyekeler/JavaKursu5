package Gun14;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {

        // Girilen bir sayının 2 aynı sayının çarpımına eşit olup olmadığını bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz= ");
        int sayi= oku.nextInt();

        int sayac=0; // mesela Scanner sayıya 5 diyelim.
        boolean tamKare=false;  // buraya, while döngüsüne ve onun dışına eklersem, olumsuzunu da yazdırırım.
        while (sayac<sayi)
        {
            if (sayac*sayac==sayi)
            {
                tamKare=true;
                System.out.println("Tam Karedir");
                break;
            }
            sayac++;
        }
        if (tamKare==false)
            System.out.println("Tam Kare Değildir");

        /* Sayı Giriniz= 9
           Tam Karedir

           Sayı Giriniz= 10
           Tam Kare Değildir */
    }
}

