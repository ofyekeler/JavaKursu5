package Gun32._03_Ornek2;

/*1*/public class Ogrenci {
    private int ID;
    private String ad;
    private String soyad;
    private int yas;

    static int sayacID=1;

/*2*/public Ogrenci(String ad, String soyad, int yas) {
/*7*/   setID(sayacID++);
        setAd(ad);
        setSoyad(soyad);
        setYas(yas);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ID=" + ID +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}
