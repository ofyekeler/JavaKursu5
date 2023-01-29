package Gun43_HataKomutlari;

import java.util.Scanner;

public class _02_JavaRunTimeException {
    public static void main(String[] args) {
        //Hatanın olma olasılığına not yazacağız.  TRY-CATCH, hata yakalama.

        System.out.println("Program başladı.");

        for (int i = 0; i < 1; i++)
        {
            try // hata bölgesini try{} ine aldık
            {
                Scanner oku = new Scanner(System.in);

                System.out.print("Sayı1 = "); // 6  ya da "h" girersen, InputMismatchException hatası
                int sayi1 = oku.nextInt();

                System.out.print("Sayı2 = "); // 0 girersen
                int sayi2 = oku.nextInt();

                int bolum = sayi1 / sayi2;
                System.out.println("Bölüm = " + bolum);  // hata alırsın; ArithmeticException: / by zero
            }
            catch (Exception hata) // hata mesajını hata isimli Exception cinsinden değişkene attım
            {
                System.out.println("hata = " + hata.getMessage());
                System.out.println("Lütfen tekrar deneyiniz.");
                i--;
            }
        }
        System.out.println("Program bitti.");
/*
Program başladı.
Sayı1 = 5
Sayı2 = 0
 hata = / by zero
Lütfen tekrar deneyiniz.
Program bitti.
*/
    }
}
