package Gun34._03_Ornek3;

public class LiseOgrencisi extends Ogrenci {
    private String brans;
    private static int liseIDsayac=1;

    public LiseOgrencisi(String isim, Tipi tipi, String brans) {
        super(isim, tipi,liseIDsayac++);
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
