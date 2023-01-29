package Gun16;

import java.util.Scanner;

public class _04_Ornek2 {
    public static void main(String[] args) {

        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz ve bu rakamları yazdırınız.

        Scanner oku=new Scanner(System.in);
        int[] sayilar  =new int[7];

        int toplam=0;
        for(int i=0 ; i<sayilar.length ; i++)
        {
            System.out.print("Notu Giriniz= ");
            sayilar[i]=oku.nextInt();
            toplam=toplam+sayilar[i];
        }
        int ortalama = toplam / sayilar.length;

        int ortGecenler=0;
        for (int i=0 ; i<sayilar.length ; i++)
        {
            if (sayilar[i] > ortalama && sayilar[i]%2!=0)
            {
                System.out.println("Ortalamadan Büyük Tek Sayılar= " + sayilar[i]);
                ortGecenler++;
            }
        }
        System.out.println("Ortalama= " + ortalama);
        System.out.println("Ort. Geçenler= " + ortGecenler);

        /* Notu Giriniz= 47
           Notu Giriniz= 48
           Notu Giriniz= 49
           Notu Giriniz= 50
           Notu Giriniz= 51
           Notu Giriniz= 52
           Notu Giriniz= 53
           Ortalamadan Büyük Tek Sayılar= 51
           Ortalamadan Büyük Tek Sayılar= 53
           Ortalama= 50
           Ort. Geçenler= 2 */

    }
}
