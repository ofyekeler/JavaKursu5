package Mentoring.mentoring_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Method_Soru3 {
    public static void main(String[] args) {

        // Soru:  Elemanları Türkiye, Almanya, Fransa, Italya ve Kanada olan ArrayList oluşturun.(method ile)
        // parametresi String ArrayList olan bir method oluşturun ArrayListdeki değerleri tersten sıralasın
        // ve yazdırsın

        // ilk hali: [Türkiye, Almanya, Fransa, Italya, Kanada]
        // tersten hali: [Kanada, Italya, Fransa, Almanya Türkiye]

        terstenSirala(ulkeEkle());

        System.out.println();
        terstenSirala2(ulkeEkle());

    }

    public static ArrayList<String > ulkeEkle(){
        ArrayList<String > ulkeler = new ArrayList<>(Arrays.asList("Türkiye", "Almanya", "Fransa", "Italya", "Kanada")); // topluca ekledik.

//        ulkeler.add("Türkiye");   //  listeye böyle de ekleme yapabiliriz.
//        ulkeler.add("Almanya");
//        ulkeler.add("Fransa");
//        ulkeler.add("Italya");
//        ulkeler.add("Kanada");

        System.out.println("listenin ilk hali: " + ulkeler);

        return ulkeler;
    }

    public static void terstenSirala(ArrayList<String > ulke){
        ArrayList<String > tersi = new ArrayList<>();

        for (int i = ulke.size()-1; i >= 0 ; i--) {
            tersi.add(ulke.get(i));
        }

        System.out.println("listenin son hali : " + tersi);
    }

    public static void terstenSirala2(ArrayList<String > ulke){
        Collections.reverse(ulke);
        System.out.println(ulke);
    }
}
