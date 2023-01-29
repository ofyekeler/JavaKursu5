package Gun19;

import java.util.Arrays;

public class _08_Ornek2 {
    public static void main(String[] args) {

        // main de 20 elemanlı bir diziyi tanımlayınız
        // daha sonra bir fonksiyona göndererek random 100 e kadar olan sayılarla
                    // doldurunuz
        // ve aynı fonksiyonda yazdırınız

        int[] dizi = new int[20];
        diziDoldurYazdir(dizi);
    }
    public static void diziDoldurYazdir(int[]sayilar) {

        for (int i = 0; i < sayilar.length; i++) // sayılar=20
        {
            sayilar[i]=(int)(Math.random()*100);
        }
        System.out.println("Sayilar= "+Arrays.toString(sayilar));
    }
/* Sayilar= [92, 87, 99, 28, 18, 26, 87, 30, 18, 55, 78, 24, 49, 62, 20, 55, 64, 76, 69, 52] */
}
