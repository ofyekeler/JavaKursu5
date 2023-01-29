package Gun25._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {

        // Ogretmen için not defteri programı yapılmak isteniyor.
        // Her ogrencının okulNo(int), tamAdi(String) ve notu(int) vardır.
        // Öğretmenden 20 öğrenci için bu bilgileri alınız.
        // bütün öğrencileri bir metodda yazdırınız.
        // sınıfın not ortalamasını yine bir metodda yazdırınız.
        // gerekli Class(lar) için ayrı dosya açınız

        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);

        ArrayList<Ogrenci> snf=new ArrayList<>();

        for (int i = 0; i < 2; i++) // yazdırması basit olsun diye 20 yerine 2 girdik.
        {
            Ogrenci ogr=new Ogrenci();
            System.out.print("Okul No= "); ogr.okulNo=okuInt.nextInt();
            System.out.print("Tam Adı= "); ogr.tamAdi=okuStr.nextLine();
            System.out.print("Notu= "); ogr.notu=okuInt.nextInt();

            snf.add(ogr);
        }
        bilgileriYaz(snf);
        ortalamaYaz(snf);
    }
    public static void bilgileriYaz(ArrayList<Ogrenci>snf){
        for (Ogrenci ogr:snf)
        {
            System.out.println("ogr.okulNo= " + ogr.okulNo);
            System.out.println("ogr tamAd= " + ogr.tamAdi);
            System.out.println("ogr.notu= " + ogr.notu);
        }
    }
    public static void ortalamaYaz(ArrayList<Ogrenci>snf){
        int toplam=0;
        for (Ogrenci ogr:snf)
        {
            toplam+= ogr.notu;
        }
        System.out.println("ort= " + (toplam/ snf.size()));
    }
}
