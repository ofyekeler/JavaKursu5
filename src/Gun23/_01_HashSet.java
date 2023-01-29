package Gun23;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {

        int sayi=5; // hafızada bir sayı saklar
        int[]dizi=new int[6]; // hafızada 6 sayı saklar
        int[][]tablo=new int[3][20]; // hafıza tablo şeklinde sayı saklar 3x20=60 sayı
        // yukarıdakilerin boyutları sabit

        // Boyutları değişken olanlar da aşağıdadır.
        ArrayList<Integer>liste=new ArrayList<>(); // boyu değişken dizi
        ArrayList<ArrayList<Integer>>listelerinListesi=new ArrayList<>();
                                                                    // 2 boyutlu, 2 boyutu da değişken

        /* ******************************************************************* */

        // Öyle bir dizi olsun ki hem ArrayList gibi olsun,
        // hem de TEKRAR değerleri içine almasın, öyle SET var bana, yani dizi tipi ver bana.

    // 3 farklı SET dizisi vardır.

        // 1) HasSet -> sen ekledikçe hızlı çalışmak için kendine göre bir sıralamada elemanları tutar.
        // 2) LinkedHashSet -> sen ekledikçe, eklenme sırana göre ("sort" gibi), elemanlarını saklar.
        // 3) TreeSet -> sen ekledikçe onları her zaman SIRALI tutar.

        // Bunların ortak özelliği, hiç TEKRAR değer BULUNDURMAZ.
                        // (mükerrer kayıt imkansız, öğrenci no, TC no, ID gibi benzersiz numaralı durumlarda...)

        HashSet<Integer>hs1=new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(38);
        hs1.add(22);
        hs1.add(4);
        boolean eklendiMi=hs1.add(5);
        boolean tekrarEklendiMi=hs1.add(5);
        hs1.add(2);

        System.out.println("eklendiMi = " + eklendiMi);
        System.out.println("tekrarEklendiMi = " + tekrarEklendiMi);
        System.out.println("hs1 = " + hs1);

/*
eklendiMi = true
tekrarEklendiMi = false
hs1 = [1, 2, 4, 5, 38, 22]
*/

    }
}
