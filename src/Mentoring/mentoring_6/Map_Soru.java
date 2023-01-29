package Mentoring.mentoring_6;

import java.util.HashMap;
import java.util.Map;

public class Map_Soru {
    public static void main(String[] args) {

        // Soru:  Verilen bir string de her harfin kaç defa tekrar ettiğini bulan bir method yazınız.

        String str = "Merhaba Dünyamm merhaba java";
        harfSay(str);
    }

    public static void harfSay(String str){
        str = str.toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();

        for (Character ch : str.toCharArray()){

            if (map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else {
                map.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> each : map.entrySet()){
            System.out.println(each.getKey() + " " + each.getValue());
        }

    }




}
