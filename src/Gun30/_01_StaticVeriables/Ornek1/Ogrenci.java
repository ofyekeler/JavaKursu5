package Gun30._01_StaticVeriables.Ornek1;

public class Ogrenci {
    String ad;
    String soyad;
   //String okulAd; // herkese ait okul adını artık metoda göndermiyorum
    static String okulAd="Yıldırım İlkokulu";
    // (sen birtanesi)
    // hepsi için geçerli tek bir eleman
    // tekrarlayan ve tüm nesneler için kullanılacak.
    // değişkenler için STATIC kullanıyoruz.
    // STATIC varsa hafızadan tasarruf sağlar
    // Hepsine atanır, tek olarak hafızada bulunur.
    // Tipin, sınıfın, class'ın değişkeni oldu.

    //public Ogrenci(String ad, String soyad, String okulAd) {
     //   this.ad = ad;
    //    this.soyad = soyad;
    //    this.okulAd = okulAd;
   // }
    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", okulAd='" + okulAd + '\'' +
                '}';
    }
}