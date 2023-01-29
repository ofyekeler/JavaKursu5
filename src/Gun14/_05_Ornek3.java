package Gun14;

import java.util.Scanner;

public class _05_Ornek3 {
    public static void main(String[] args) {

        // Girilen bir sayıya (dahil) kadar olan sayıların çarpımını bulunuz.
        // 2. Ek Soru: Çarpımın değeri 10.000 ü geçtiğinde işlem sonlansın.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz= ");
        int sayi= oku.nextInt();
        int carpim=1;

        for (int i=1; i<=sayi; i++) // sabit komutlar
        {
            carpim=carpim*i;
            if (carpim>=10000)
            {
            System.out.println("Break Çalıştı");
            break;
            }
        }
        System.out.println("Çarpımı= " + carpim);

        /* Sayı Giriniz= 5
           Çarpımı= 120

           Sayı Giriniz= 10
           Break Çalıştı
           Çarpımı= 40320 */

    }
}
