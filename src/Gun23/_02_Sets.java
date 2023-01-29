package Gun23;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {

        // SETS
        // HashSet : Hızlı, bunun için kendine göre algoritmik sırada tutar.
        // LinkedHashSet: Ekleme sırasıne göre sıralı tutar.
        // TreeSet : sen ne eklersen ekle, içinde SIRALI şekilde tutar.

        HashSet<String>hs=new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");
        System.out.println("HashSet= " + hs);

        LinkedHashSet<String>hs1=new LinkedHashSet<>();
        hs1.add("bir");
        hs1.add("iki");
        hs1.add("üç");
        hs1.add("dört");
        hs1.add("beş");
        System.out.println("LinkedHashSet= " + hs1);

        TreeSet<String>hs2=new TreeSet<>();
        hs2.add("bir");
        hs2.add("iki");
        hs2.add("üç");
        hs2.add("dört");
        hs2.add("beş");
        System.out.println("TreeSet= " + hs2);

/*
HashSet       = [dört, iki, bir, üç, beş]  rastgele sıralar
LinkedHashSet = [bir, iki, üç, dört, beş]  okuduğu gibi, ekleme sırasına göre sıralar
TreeSet       = [beş, bir, dört, iki, üç]  küçükten büyüğe sıralar
*/

    }
}
