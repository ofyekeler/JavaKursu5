package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Ornek1 {
    public static void main(String[] args) {

        // Günün sorusu: 3x2 lik bir siziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemanlarını
        // tek boyutlu bir diziye atayınız.

        Scanner oku=new Scanner(System.in);
        int[][] tablo=new int [3][2];

        // Okuma İşlemi

        int tekMik=0;

        for (int i = 0; i < tablo.length ; i++)
        {
            for (int j = 0; j < tablo[i].length; j++)
            {
                System.out.print("Sayı Giriniz= ");
                tablo[i][j]= oku.nextInt();

                if (tablo[i][j]%2!=0) // kaç tane tek olduğunu buluyoruz ki
                                 // aşağıda kaç oda ayıracağımızı belirledik (henüz oda doldurmadık)
                    tekMik++;
            }
        }
        
        int [] teklerDizisi=new int[tekMik];  // teklerin miktarı kadar bir dizi tanımladı

        tekMik=0; // tekrar sıfırladım ki 0. odadan başlayarak atama yapabileyim.

        for (int i = 0; i < tablo.length ; i++)
        {
            for (int j = 0; j < tablo[i].length; j++)
            {
                if (tablo[i][j] % 2 != 0)
                {
                    teklerDizisi[tekMik]=tablo[i][j]; // çiftten tek diziye çevirdim.
                    tekMik++;
                }
            }
        }
        System.out.println(Arrays.toString(teklerDizisi)); // tek dizinin kısayoldan yazdırması
/*
Sayı Giriniz= 1
Sayı Giriniz= 2
Sayı Giriniz= 3
Sayı Giriniz= 4
Sayı Giriniz= 5
Sayı Giriniz= 6
[1, 3, 5]
*/
    }
}
