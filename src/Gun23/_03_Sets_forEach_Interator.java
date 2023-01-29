package Gun23;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets_forEach_Interator {
    public static void main(String[] args) {

        HashSet<String> renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");

        // Ekrana yazdırma
        System.out.println("renkler = " + renkler);

        // Ekrana tek tek yazdırma "for each"
        for (String elemanlar:renkler)
        {
            System.out.println("elemanlar= " + elemanlar);
        }

        // foreach ile ilgili örnek olsun diye aşağıdaki örnek eklendi
            //        int []dizi={34,5,6,7,8,89,899,77};
            //        for (int sayi:dizi)
            //        {
            //            System.out.println("sayi = " + sayi);
            //        }

        // iteleme, hafızadaki sırası neyse o sıraya göre gösterir
        Iterator gosterge= renkler.iterator();
        while (gosterge.hasNext())
        {
            System.out.println("gosterge.next() = " + gosterge.next());
        }

        // forEach rastgele yazdırır, Iterator ise Set de sırası nasılsa o sırada yazdırır.
    }
}
