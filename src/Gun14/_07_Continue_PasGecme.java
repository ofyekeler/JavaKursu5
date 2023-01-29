package Gun14;

import java.util.Scanner;

public class _07_Continue_PasGecme {
    public static void main(String[] args) {

        // Kullanıcıdan 5 sayı isteyiniz.
        // Bu sayılardan 6 ile 10 arasındakiler hariç, diğerlerini toplasın.

        Scanner oku=new Scanner(System.in);

        int toplam=0;
        for(int i=0; i<5; i++)
        {
            System.out.print("Bir Sayı Giriniz= ");
            int sayi= oku.nextInt();

            if (sayi>=6 && sayi<=10)
                continue; // çalıştığı anda if içindeki değerleri PAS GEÇER ve işleme devam eder.
            toplam+=sayi;
            System.out.println("toplam = " + toplam);
        }
        /* Bir Sayı Giriniz= 4
           toplam = 4

           Bir Sayı Giriniz= 5
           toplam = 9

           Bir Sayı Giriniz= 7

           Bir Sayı Giriniz= 8

           Bir Sayı Giriniz= 11
           toplam = 20 */
    }
}
