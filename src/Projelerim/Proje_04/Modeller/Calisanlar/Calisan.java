package Projelerim.Proje_04.Modeller.Calisanlar;

import Projelerim.Proje_04.Modeller.Departmanlar.Departman;
import Projelerim.Proje_04.Veritabani.Calisanlar;
import Projelerim.Proje_04.Veritabani.Departmanlar;

public class Calisan {

    private String calisanId;
    private String adSoyad;
    private int maas;
    private Departman Departman;
    private String isimKodu = "";

    static int sayac = 1;

    public Calisan(String adSoyad, int maas, String departmanKodu) {
        this.adSoyad = adSoyad;
        this.maas = maas;
        setDepartman(departmanKodu);
        this.setCalisanId();
        Calisanlar.addACalisan(this);
    }
    // Kullanicinin departman koduna göre, gerekli departman set edilmelidir.
    private void setDepartman(String departmanKodu) {
        /*
            İpucu: Departman listesinin (Veritabani.Departmanlar.DepartmanList) içerisindeki departmanların kodları var,
        bu kodlari donguye tutmak işe yarayabilir.
       */
        for (Departman dprt : Departmanlar.getDepartmanList()) {
            if (dprt.getDepartmanKodu().equalsIgnoreCase(departmanKodu))
                this.Departman = dprt;
        }
    }
    // Calisanin ID sinin kendisine özel olduğundan bahsetmistik, ID nin nasil kaydedileceği CalisanKaydetmeProjesiTanıtım.txt
    // içerisinde yer aliyor.
    private void setCalisanId() {
        /*
            İpucu: Detayli anlatim CalisanKaydetmeProjesiTanıtım.txt içerisinde.
         */
        this.calisanId = this.Departman.getDepartmanKodu() + (sayac++) + getCalisanIsimKodu();
    }

    // Calisanin ID sinin sonuna isim kodu eklenmesi için, ismi parçalayan bir method.
    private String getCalisanIsimKodu() {
        /*
            Basit string metodlari ise isinice cok yarayacaktir fakat dinamik olmasina dikkat edelim... Mesela 2 isim bir
            soyisim girildiğinde hata vermesin.

         */
        String[] tamIsim = adSoyad.split(" ");
        for (String a : tamIsim) {
            isimKodu = isimKodu.concat(a.substring(0, 1).toUpperCase());
        }
        return isimKodu;
    }

    // Calisanin id sini almak icin basit getter method
    public String getCalisanId() {
        return this.calisanId;
    }

    // Calisanin departmanini almak icin basit getter method
    public Departman getDepartman() {
        return this.Departman;
    }

    // Departman adini verebilmek için bir method
    public String getDepartmanAdi() {
        /*
                İpucu: Departman Kodu YD ise departman adi Yonetim Departmani olarak kaydedilmelidir.
         */
        String departmanAdi = "";
        if (Departman.getDepartmanKodu().equalsIgnoreCase("YD"))
            departmanAdi = "Yönetim Departmanı";
        else if (Departman.getDepartmanKodu().equalsIgnoreCase("BTD")) {
            departmanAdi = "Bilişim Teknolojileri Departmanı";
        } else if (Departman.getDepartmanKodu().equalsIgnoreCase("IKD")) {
            departmanAdi = "Insan Kaynakları Departmanı";
        }

        return departmanAdi;
    }

    // Calisana zam yapilmasi için gerekli bir method
    public static void zamYap(String calisanId) {
        /*
            İpucu: Calisan ID si kullanilarak yapilmalidir, diğer attributelarin aynilarindan 1 er tane daha
            olabilirdi.
         */
        for (int i = 0; i <  Calisanlar.getCalisanList().size(); i++) {
            if ( Calisanlar.getCalisanList().get(i).getCalisanId().equalsIgnoreCase(calisanId)) {
                Calisanlar.getCalisanList().get(i).maas +=
                        ( Calisanlar.getCalisanList().get(i).maas *  Calisanlar.getCalisanList().get(i).Departman.getZamOrani()) / 100;

                System.out.println("Maaş: "+Calisanlar.getCalisanList().get(i).maas );
            }
        }
    }

    // Calisanlari yazdırmak için gerekli bir override
    @Override
    public String toString() {

        /*
            İpucu: Detayli anlatim CalisanKaydetmeProjesiTanıtım.txt içerisinde.

         */
        return "Calisan{" +
                "calisanId='" + calisanId + '\'' +
                ", Ad ve Soyad='" + adSoyad + '\'' +
                ", Maas=" + maas +
                ", Departman=" + getDepartmanAdi() +
                '}';
    }
}
