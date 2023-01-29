package Gun24;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {

        // Set -> HashSet, LinkedHashSet, TreeSet
        // Map -> HashMap, LinkedHashMap, TreeMap
        // artık index ten çıkıyoruz. Onun yerine;
        // Map = Anahtar + Set -> Anatarlı Set

        // anahtar tipi Integer, değerin tipi String olsun
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1001,"Ismet Temur"); // oda numarasını biz belirleyip biz atıyoruz
        hm.put(1002, "Cihat Yılmaz");
        hm.put(2001,"Talip Yıldız");
        hm.put(5001,"Eyüpcan Bilgin");
        hm.put(1002,"Hatice Bayrak");

        System.out.println("hm = " + hm); // "Integer - String" i birlikte verir.
        System.out.println("hm.get(2001) = " + hm.get(2001));
        
        System.out.println("hm.containsKey(2001) = " + hm.containsKey(2001));
        System.out.println("hm.containsKey(12) = " + hm.containsKey(12));

        System.out.println("hm.keySet() = " + hm.keySet()); // Integer larını verir
        System.out.println("hm.values() = " + hm.values()); // String lerini verir.

        hm.remove(5001);
        System.out.println("hm remove 5001 = " + hm);

        System.out.println("hm.size() = " + hm.size());

        hm.clear();
        System.out.println("hm clear = " + hm);

/*
                  hm = {2001=Talip Yıldız, 1001=Ismet Temur, 5001=Eyüpcan Bilgin, 1002=Hatice Bayrak}
        hm.get(2001) = Talip Yıldız
hm.containsKey(2001) = true
  hm.containsKey(12) = false
         hm.keySet() = [2001, 1001, 5001, 1002]
         hm.values() = [Talip Yıldız, Ismet Temur, Eyüpcan Bilgin, Hatice Bayrak]
      hm remove 5001 = {2001=Talip Yıldız, 1001=Ismet Temur, 1002=Hatice Bayrak}
           hm.size() = 3
            hm clear = {}
*/
    }
}
