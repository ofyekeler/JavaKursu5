package Mentoring.mentoring_7.OOP_Ornek2;

public class Ogrenci {

    String ad;

    String soyad;

    int sinif;


    // Constructors : Nesneye ait değerleri nesne oluşturulduğu anda vermeyi sağlar
    // Class adıyla aynı olmak zorunda
    // biz oluşturmasak dahi Java bizim için bir yapıcı metod oluşturuyor.
    public Ogrenci(String ad, String soyad, int sinif) {
        this.ad = ad;
        this.soyad = soyad;
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sinif=" + sinif +
                '}';
    }
}
