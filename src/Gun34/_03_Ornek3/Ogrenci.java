package Gun34._03_Ornek3;

public class Ogrenci {
    private final int id; // FINAL yazdığımızda artık DEĞİŞTİRİLEMEZ, değer ATAYAMAZ !!!
    private String isim;
    private Tipi tipi;

    public Ogrenci(String isim, Tipi tipi,int id) {
        setIsim(isim);
        setTipi(tipi);
        this.id=id;
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

    public int getId() { return id; }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tipi='" + tipi + '\'' +
                '}';
    }
}
