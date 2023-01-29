package Gun17;

import java.util.Scanner;

public class _01_Ornek1 {
    public static void main(String[] args) {

        // 10 elemanlı bir dizi tamamlayınız, 9 a kadar olan sayılardan Random atayarak doldurunuz.
        // Sonrasında ayrı bir döngü ile tek olanlar 1, çift olanlara 0 atayınız, yazdırınız.

        int[] dizi  =new int[10];

        for (int i = 0; i < dizi.length ; i++)
        {
            dizi[i] = (int) (Math.random()*10); // 10'un bir üstünü yazdık.
        }
        // dizi öncesi
        for (int i = 0; i < dizi.length; i++)
        {
            System.out.println("Dizi Önce= " + dizi[i]);
        }
        for (int i = 0; i < dizi.length; i++)
        {
            if (dizi[i]%2==0)   //çiftse
                dizi[i]=0;
            else   // tekse
                dizi[i]=1;
        }
        // dizi sonrası
        for (int i = 0; i < dizi.length; i++)
        {
            System.out.println("Dizi Sonra= " + dizi[i]);
        }

        /* Dizi Önce= 9 Dizi Sonra= 1
           Dizi Önce= 6 Dizi Sonra= 0
           Dizi Önce= 8 Dizi Sonra= 0
           Dizi Önce= 5 Dizi Sonra= 1
           Dizi Önce= 8 Dizi Sonra= 0
           Dizi Önce= 6 Dizi Sonra= 0
           Dizi Önce= 6 Dizi Sonra= 0
           Dizi Önce= 9 Dizi Sonra= 1
           Dizi Önce= 9 Dizi Sonra= 1
           Dizi Önce= 8 Dizi Sonra= 0 */

    }
}
