package Gun06;

import java.util.Scanner;

public class _06_Ornek3 {
    public static void main(String[] args) {

        // Girilen bir ad soyadı "Ismet Temur" u I.T. şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Adınız= ");
        String ad=oku.nextLine();

        System.out.print("Soyadınız= ");
        String soyad=oku.nextLine();

        char ilkHarfAd=ad.charAt(0);
        char ilkHarfSoyad=soyad.charAt(0);

        System.out.println(ilkHarfAd + "." + ilkHarfSoyad + ".");

        /* Adınız= Ismet
           Soyadınız= Temur
           I.T. */

    // 2. yöntem:

        Scanner okuyucu=new Scanner(System.in);

        System.out.print("Adınız ve soyadınız= ");
        String adSoyad=okuyucu.nextLine();

        char ilkHarf=adSoyad.charAt(0);
        int boslukIndex=adSoyad.indexOf(" ");
        char soyadIlkHarf=adSoyad.charAt(boslukIndex+1);
            // char soyadIlkHarf=adSoyad.charAt(adSoyad.indexOf(" ")+1); de denilebilir.

        System.out.println(ilkHarf + "." + soyadIlkHarf+".");

        /* Adınız ve soyadınız= Ismet Temur
           I.T. */
    }
}
