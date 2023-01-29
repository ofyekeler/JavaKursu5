package Gun07;

import java.util.Scanner;

public class _06_Ornek1 {
    public static void main(String[] args) {

        // Tek seferde girilen bir ad soyadın (tam ad) adını ve soyadını ayırıp,
        // ayrı ayrı yazdırınız. (sadece ad ve soyad)
        // ad=0 dan boşluğun indexine kadar,
        // soyad'dan boşluk+1 e kadar.

        Scanner oku=new Scanner(System.in);

        System.out.print("Adınız ve Soyadınız= ");
        String adSoyad= oku.nextLine();

        int boslukIndex=adSoyad.indexOf(" ");
        String ad= adSoyad.substring(0,boslukIndex);
        String soyad= adSoyad.substring(boslukIndex+1);


        System.out.println("ad= " + ad);
        System.out.println("soyad= " + soyad);

        /* Adınız ve Soyadınız= Faruk YEKELER
           ad= Faruk
           soyad= YEKELER */

    }
}
