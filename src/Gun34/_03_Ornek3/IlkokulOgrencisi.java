package Gun34._03_Ornek3;

public class IlkokulOgrencisi extends Ogrenci {
    private String klup;
    private static int ioIDsayac=1;

    public IlkokulOgrencisi(String isim, Tipi tipi, String klup) {
        super(isim, tipi,ioIDsayac++);
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
