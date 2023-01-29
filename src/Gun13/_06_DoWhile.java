package Gun13;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {

        // kullanıcı 0 değerini girene kadar
        // girdiği sayıların toplamını bulunuz

        Scanner oku=new Scanner(System.in);

        int toplam=0;

        // 1. Yöntem

        /* System.out.print("Sayı Giriniz= ");
        int sayi= oku.nextInt();
        toplam=toplam+sayi;

        while (sayi != 0)
        {
            System.out.print("Sayı Giriniz= ");
            sayi= oku.nextInt();
            toplam=toplam+sayi;
        }
        System.out.println("toplam = " + toplam); */

        // 2. Yöntem,  DO  WHILE
        int sayi;  // sayıyı döngünün dışında tanımladık, döngüdeki int i kaldırdık.
                   // aksi takdirde while içinde sayi ibaresini okumaz.
        do {   // Döngü arası şart başta olmadığından...
               // ...en az bir kere çalışır, kontrol sondadır.
               // Birinci yöntemde hem döngü dışında hem de döngü içinde...
               // ...okuma işlemi yapmak zorunda kalıyorduk.
               // WHILE ı döngünün sonuna koymak istiyorsak...
               // döngünün başına DO koyacağız
            System.out.print("Sayı Giriniz= ");
            sayi= oku.nextInt();
            toplam=toplam+sayi;
        } while (sayi != 0); // döngü sonunda while olduğu için noktalı virgül (;) var.

        System.out.println("toplam = " + toplam);

    }
}
