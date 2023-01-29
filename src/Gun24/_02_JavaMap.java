package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {

        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1001,"Ismet Temur");  // add yerine put kullanılıyor
        hm.put(1002, "Cihat Yılmaz");
        hm.put(2001,"Talip Yıldız");
        hm.put(5001,"Eyüpcan Bilgin");
        hm.put(1002,"Hatice Bayrak");

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        for (Integer k:hm.keySet()) // Integer ları alt alta yazdırma
            System.out.println(k);

        System.out.println();

        for (String v: hm.values()) // String leri alt alta yazdırma
            System.out.println(v);

        System.out.println();

        for (Map.Entry<Integer,String> kv : hm.entrySet()) // Integer-String tamamını yazdırır.
            System.out.println(kv.getKey()+ " - " +kv.getValue());
/*
hm.keySet() = [2001, 1001, 5001, 1002]
hm.values() = [Talip Yıldız, Ismet Temur, Eyüpcan Bilgin, Hatice Bayrak]
2001
1001
5001
1002

Talip Yıldız
Ismet Temur
Eyüpcan Bilgin
Hatice Bayrak
2001 - Talip Yıldız
1001 - Ismet Temur
5001 - Eyüpcan Bilgin
1002 - Hatice Bayrak
*/
    }
}
