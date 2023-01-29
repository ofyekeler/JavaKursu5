package Gun34._02_Ornek2;

public class Ogrenci {
    private final int id; // FINAL yazdığımızda artık DEĞİŞTİRİLEMEZ, değer ATAYAMAZ !!!
    private String isim;
    private Tipi tipi;

    private static int sayacID=1;

    public Ogrenci(String isim, Tipi tipi) {
        setIsim(isim);
        setTipi(tipi);
        this.id=sayacID++;
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public Tipi getTipi() {
        return tipi;
    }
    public void setTipi(Tipi tipi) {
        this.tipi = tipi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tipi='" + tipi + '\'' +
                '}';
    }
}
