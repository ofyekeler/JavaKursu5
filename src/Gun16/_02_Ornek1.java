package Gun16;

import java.util.Scanner;

public class _02_Ornek1 {
    public static void main(String[] args) {

        // 7 kişilik bir sınfın notlarını giriniz ve
        // ortalamadan büyük kaç not olduğunu bulunuz ve bunları yazdırınız.

        int[] notlar  =new int[7]; // 7 tane int kutusu oluşturuldu.

        Scanner oku=new Scanner(System.in);
        int toplam=0;
        for(int i=0 ; i<notlar.length ; i++)
        {
            System.out.print("Notu Giriniz= ");
            notlar[i]=oku.nextInt();
            toplam=toplam+notlar[i];
        }
        int ortalama = toplam / notlar.length;

        int gecenler=0;
        for (int i=0 ; i<notlar.length ; i++)
        {
            if (notlar[i] > ortalama)
            {
                System.out.println("Ortalamadan Büyük Notlar= " + notlar[i]);
                gecenler++;
            }
        }
        System.out.println("ortalama = " + ortalama);
        System.out.println("gecenler = " + gecenler);

        /* Notu Giriniz= 20
           Notu Giriniz= 30
           Notu Giriniz= 40
           Notu Giriniz= 50
           Notu Giriniz= 60
           Notu Giriniz= 70
           Ortalamadan Büyük Notlar= 50
           Ortalamadan Büyük Notlar= 60
           Ortalamadan Büyük Notlar= 70
           ortalama = 40
           gecenler = 3 */

    }
}
