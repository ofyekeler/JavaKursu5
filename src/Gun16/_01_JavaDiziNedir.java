package Gun16;

import java.util.Scanner;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {

        // int ogrNot; // 1 tane not saklar
        // 50 kişi var
        //        int ogr1Not;
        //        int ogr2Not;
        //        int ogr3Not;
        //        //....
        //        //....
        //        //....
        //        int ogr50Not;
        //
        //        // bana bir tanımlamada BIRDEN FAZLA değer tutabilen bir değişkene ihtiyacım var;
        //        // ÇÖZÜM :
       
        // int[] notlar  =new int[50]; // 50 tane int saklayabilen notlar isimli değişken
        
        // notlar[0] = 75;
        // notlar [1] = 88;
        //...
        // notlar[49]=95; // en son eleman toplam eleman sayısı-1 length-1 dir. Böyle de 0-49 index tir. 50nci öğrenci notu.

        // System.out.println("notlar[0] = " + notlar[0]);
        // System.out.println("notlar.length = " + notlar.length); // 50, yani toplam eleman sayısını verir.

        // Diziyi nasıl okuturum.

        int[] notlar  =new int[5]; // "Scanner" yerine "int", "oku" yerine "notlar,
                                   // () yerine [], "System.in" yerine de rakam geldi

        Scanner oku=new Scanner(System.in);
        for(int i=0 ; i<notlar.length ; i++)
        {
            System.out.print("Notu Giriniz= ");
            notlar[i]=oku.nextInt();
        }
        for (int i=0 ; i< notlar.length ; i++)
        {
            System.out.println(notlar[i]);
        }
        /* Notu Giriniz= 100
           Notu Giriniz= 90
           Notu Giriniz= 70
           Notu Giriniz= 15
           Notu Giriniz= 48
           100
           90
           70
           15
           48 */
    }
}
