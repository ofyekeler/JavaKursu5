package Mentoring.mentoring_6;

import java.util.HashMap;
import java.util.Map;

public class Map_HashMap {
    public static void main(String[] args) {


        HashMap<String , String> map = new HashMap<>();
        map.put("Key1", "Value1");
        map.put("Key2", "Value2");
        map.put("Key3", "Value3");
        map.put("Key4", "Value3");  // aynı value ekleyebiliriz. Key ise bir kere tanımlıyoruz.

        System.out.println(map);
        System.out.println(map.get("Key1")); // key üzerinden Value1 ulaştık.
        System.out.println("---------");

        for (Map.Entry<String , String > i : map.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }
        //**************************************************

        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('a', 1);
        hm.put('b', 2);
        hm.put('c', 3);
        hm.put('d', 4);
        System.out.println(hm.get('c'));  // value olarak 3 e ulaşmış oluyorum.

        for (Character c: hm.keySet()){
            System.out.print(c + " ");
        }

        System.out.println();
        for (Integer c: hm.values()){
            System.out.print(c + " ");
        }

    }
}
