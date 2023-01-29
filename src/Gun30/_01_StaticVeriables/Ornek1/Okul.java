package Gun30._01_StaticVeriables.Ornek1;

public class Okul {
    public static void main(String[] args) {
      //  Ogrenci ogr1=new Ogrenci("İsmet","Temur","Yıldırım İlkokulu");
      //  Ogrenci ogr2=new Ogrenci("Mehmet","Demir","Yıldırım İlkokulu");
      //  Ogrenci ogr3=new Ogrenci("Ayşe","Yıldız","Yıldırım İlkokulu");

        // ...
        // ...
        // ...

      //  Ogrenci ogr499=new Ogrenci("Uğur","Çolak","Yıldırım İlkokulu");
      //  Ogrenci ogr500=new Ogrenci("Tuğser","Bayrak","Yıldırım İlkokulu");

        // okul adı tüm öğrencilere ait.

        Ogrenci ogr1=new Ogrenci("İsmet","Temur");
        System.out.println("ogr1 = " + ogr1);

        /* ogr1 = Ogrenci{ad='İsmet', soyad='Temur', okulAd='Yıldırım İlkokulu'} */

        Ogrenci.okulAd="Atatürk İlkokulu";
        System.out.println("ogr1 = " + ogr1);

        /* ogr1 = Ogrenci{ad='İsmet', soyad='Temur', okulAd='Atatürk İlkokulu'} */

        // Aynı verinin çok kez girişi engellendi (okul adı)
        // Aynı verinin hafızada NESNE sayısı kadar tekrarlanması engellendi.
    }
}
