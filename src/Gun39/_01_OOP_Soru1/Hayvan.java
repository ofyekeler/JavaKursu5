package Gun39._01_OOP_Soru1;

public abstract class Hayvan {
    private final int id;
    private String isim;
    private boolean vahsi;
    private String dogumTarihi;

    abstract void yiyecegi();
    abstract void yemekMiktari();
    abstract void gunlukUykuSuresi();
    abstract void sesi();

    private static int idSayac=1;

    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
        this.id=idSayac++;
        setIsim(isim);
        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);
    }

    @Override
    public String toString() {
        System.out.print("yiyecegi="); yiyecegi();
        System.out.print("Yemek Miktarı="); yemekMiktari();
        System.out.print("Günlük Uyku Süresi="); gunlukUykuSuresi();
        System.out.print("sesi="); sesi();
        return "Hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                "}\n";
    }

    public int getId() {  // ID nin sadece GET i var !!!
        return id;
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public boolean isVahsi() {
        return vahsi;
    }
    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }
    public String getDogumTarihi() {
        return dogumTarihi;
    }
    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }
    public static int getIdSayac() {
        return idSayac;
    }
    public static void setIdSayac(int idSayac) {
        Hayvan.idSayac = idSayac;
    }
}
