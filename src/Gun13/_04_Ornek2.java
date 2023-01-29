package Gun13;

import java.util.Scanner;

public class _04_Ornek2 {
    public static void main(String[] args) {

        // Girilen 5 sayıdan sadece pozitif olanlarının toplamını yazdırınız.

        Scanner oku= new Scanner(System.in);

        int toplam=0;
        int sayac=1;
        while (sayac<=5){
            System.out.print(sayac+". "+"Sayıyı Giriniz= ");
            int sayi= oku.nextInt();
            if (sayi>0)
                toplam=toplam+sayi;
            sayac++;
        }
        System.out.println("Sayıların Toplamı= " + toplam);

        /* 1. Sayıyı Giriniz= 1
           2. Sayıyı Giriniz= 2
           3. Sayıyı Giriniz= 3
           4. Sayıyı Giriniz= 4
           5. Sayıyı Giriniz= -1
           Sayıların Toplamı= 10 */

    }
}
