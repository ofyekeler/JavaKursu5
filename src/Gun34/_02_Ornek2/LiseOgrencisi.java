package Gun34._02_Ornek2;

public class LiseOgrencisi extends Ogrenci{
    private String brans;

    public LiseOgrencisi(String isim, Tipi tipi,String brans) {
        super(isim, tipi);
        setBrans(brans);
    }
    public String getBrans() {
        return brans;
    }
    public void setBrans(String brans) {
        this.brans = brans;
    }
    @Override
    public String toString() {
        return super.toString()+getBrans();
    }
}
