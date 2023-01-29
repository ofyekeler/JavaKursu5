package Gun34._02_Ornek2;

public class IlkokulOgrencisi extends Ogrenci{
    private String klup;

    public IlkokulOgrencisi(String isim, Tipi tipi,String klup) {
        super(isim, tipi);
        setKlup(klup);
    }
    public String getKlup() {
        return klup;
    }
    public void setKlup(String klup) {
        this.klup = klup;
    }

    @Override
    public String toString() {
        return super.toString()+getKlup();
    }
}
