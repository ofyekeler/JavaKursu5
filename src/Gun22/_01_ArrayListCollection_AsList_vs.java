package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_ArrayListCollection_AsList_vs {
    public static void main(String[] args) {
        
        // ArrayList Collection grubunun bir elemanı
        // Array i sıralarken Arrays.sort u kullandığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.

        ArrayList<Integer>rakamlar=new ArrayList<>();
        rakamlar.add(50);
        rakamlar.add(5);
        rakamlar.add(456);
        rakamlar.add(45);
        rakamlar.add(3);

        System.out.println("rakamlar = " + rakamlar);
        
        // Sıralama işlemi
        Collections.sort(rakamlar);
        System.out.println("rakamlar sıralı= " + rakamlar);
        
        //Tersine çevir
        Collections.reverse(rakamlar);
        System.out.println("rakamlar tersi = " + rakamlar);
        
        // Max ve Min eleman bulma
        System.out.println("Collections.max(rakamlar) = " + Collections.max(rakamlar));
        System.out.println("Collections.min(rakamlar) = " + Collections.min(rakamlar));

        // Bütün elemanları set etme
        Collections.fill(rakamlar,0); // bütün elemanları 0 a atar
        System.out.println("rakamlar set etme= " + rakamlar);

        //repalce
        Collections.replaceAll(rakamlar,0,5); // 0 ları 5 e atadı
        System.out.println("rakamlar rePlaceAll= " + rakamlar);

        // tanımlarken değer atama
        int[]dizi={2,3,4,5};
        ArrayList<Integer>intListe=new ArrayList<>(Arrays.asList(3,4,5,6)); // parantez içine "dizi" yerine,
                                                    // dizideki değerler yerine atayacağımız rakamları yazdık
        ArrayList<String>strListe=new ArrayList<>(Arrays.asList("ahmet","mehmet","büşra","roman"));
        System.out.println("intliste = " + intListe);
        System.out.println("strliste = " + strListe);

        ArrayList<Integer>intListe2=new ArrayList<>();
        Collections.addAll(intListe, 7,8,9,10,11); // mevcutu bozmadan üzerine ekler
        System.out.println("intListe2 = " + intListe);

        // diziyi direk ArrayList e nasıl atarım.
        Integer[]dizi2={2,3,4,5};
        ArrayList<Integer>liste3=new ArrayList<>(Arrays.asList(dizi2)); // parantez içine "dizi2" yazarak atama yaptık
        System.out.println("liste3 = " + liste3);

    }
}
