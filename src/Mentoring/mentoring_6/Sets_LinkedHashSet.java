package Mentoring.mentoring_6;

import java.util.LinkedHashSet;

public class Sets_LinkedHashSet {
    public static void main(String[] args) {

        // LinkedHashSet : Eklenme sırasına göre saklar, null değere izin verir.

        LinkedHashSet<String > renkler = new LinkedHashSet<>();

        renkler.add("beyaz");
        renkler.add("fuşya");
        renkler.add("turuncu");
        renkler.add("mavi");
        renkler.add("yeşil");
        renkler.add(null);


        System.out.println(renkler);  // setin tamamını yazdırdık

        for (String i : renkler){
            System.out.println(i);  // setin her bir elemanını ayrı ayrı yazdırdık.
        }



    }
}
