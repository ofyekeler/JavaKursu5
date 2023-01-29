package Gun33._02_Ornek1;

public class Yılan extends Hayvan {

    private int uzunluk;
    public Yılan(String renk, int kilo, String cinsi,int uzunluk) {
        super(renk, kilo, cinsi);
        setUzunluk(uzunluk);
    }
    @Override
    public void konustu() {
        System.out.println("Tısladı.");
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }
}
