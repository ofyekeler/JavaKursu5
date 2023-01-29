package Gun24;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _04_Ornek1 {
    public static void main(String[] args) {

        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(9,"tilki");
        hm.put(2,"kedi");
        hm.put(30,"köpek");
        hm.put(11,"kuş");
        hm.put(4,"kurt");
        System.out.println("hm = " + hm); // hızlı çalışmak için, kafasına göre sıralar

        Map<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(9,"tilki");
        lhm.put(2,"kedi");
        lhm.put(30,"köpek");
        lhm.put(11,"kuş");
        lhm.put(4,"kurt");
        System.out.println("lhm = " + lhm); // eklendiği sıraya göre sıralar

        Map<Integer,String> tm=new TreeMap<>();
        tm.put(9,"tilki");
        tm.put(2,"kedi");
        tm.put(30,"köpek");
        tm.put(11,"kuş");
        tm.put(4,"kurt");
        System.out.println("tm = " + tm); // Herzaman sıralı KEY e göre, kendinden SORT yapar

/*
 hm = {2=kedi, 4=kurt, 9=tilki, 11=kuş, 30=köpek}
lhm = {9=tilki, 2=kedi, 30=köpek, 11=kuş, 4=kurt}
 tm = {2=kedi, 4=kurt, 9=tilki, 11=kuş, 30=köpek}
*/
    }
}
