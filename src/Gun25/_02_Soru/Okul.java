package Gun25._02_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {

        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        ArrayList<Ogrenci> sinifList=new ArrayList<>();

        for (int i = 0; i < 3; i++)
        {
            Ogrenci ogr=new Ogrenci();
            System.out.println("Öğrenci Adı= ");    ogr.adi= okuStr.nextLine();
            System.out.println("Öğrenci Soyadı= "); ogr.soyadi= okuStr.nextLine();
            System.out.println("Öğrenci Sıfını= "); ogr.sinifi=okuInt.nextInt();
            System.out.println("Öğrenci Adresi= "); ogr.adres=okuStr.nextLine();
            
            sinifList.add(ogr);
        }

        for (Ogrenci ogr:sinifList)
        {
            System.out.println("ogr.adi = " + ogr.adi);
            System.out.println("ogr.soyadi = " + ogr.soyadi);
            System.out.println("ogr.sinifi = " + ogr.sinifi);
            System.out.println("ogr.adres = " + ogr.adres);
        }

    }
}
class Ogrenci{
    // PROPERTIES, FIELD, ÖZELLİK bölümü.
    String adi;
    String soyadi;
    int sinifi;
    String adres;
}