package Gun09;

import java.util.Scanner;

public class _01_Javalf_BaklavaDilimi {
    public static void main(String[] args) {

        // Baklava dilimimiz -> if  'dir. (eğer)
        // Girilen bir sayı 10'dan büyük ise ekrana 10 dan büyük yazdırınız.
        // Algoritma
        // 1 - Başla {
        // 2 - sayı oku   sayi=oku.nextInt()
        // 3 - sayi>10 ise "10 dan büyük" yaz -> if (sayi > 10) sout...
        // 4 - Dur

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz= ");
        int sayi=oku.nextInt();

        if (sayi>10)   //   ; (noktalı virgül) kullanılmıyor !!!

        {   // if şartı sağladığında yapılacakların parantezi.
            System.out.println("10 dan büyük"); // bu koddan birden fazla varsa {} karakterlerin arasına yazacaksın
                                                // bir komut varken de kullansan olur.
        }

        /* Sayı Giriniz= 11
           10 dan büyük */
        /* Sayı Giriniz= 5 */ // "10 dan büyük" metnini yazdırmadı.

        // if in içinde birden fazla komut var ise if parantezleri şarttır.

    }
}
