package Gun08;

import java.util.Scanner;

public class _09_Ornek3 {
    public static void main(String[] args) {

        // Girilen bir cümledeki ilk kelimeyi yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle Giriniz= ");
        String cumle=oku.nextLine();

        int boslukIndex=cumle.indexOf(" ");
        String ilkKelime=cumle.substring(0, boslukIndex);
        System.out.println("ilkKelime= " + ilkKelime);

        /* Cümle Giriniz= Bugün hava çok soğuk.
           ilkKelime= Bugün */

    }
}
