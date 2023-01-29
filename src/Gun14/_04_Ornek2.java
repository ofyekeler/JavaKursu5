package Gun14;

import java.util.Scanner;

public class _04_Ornek2 {
    public static void main(String[] args) {

        // Kullanıcının gireceği bir rakama kadar olan sayıların toplamını bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz= ");
        int sayi= oku.nextInt();
        int toplam=0;

        for (int i=1; i<=sayi; i++) // sabit komutlar
        {
            toplam += i;
        }
            System.out.println("Toplam= " + toplam);

        /* Sayı Giriniz= 5
           Toplam= 15 */

    }
}
