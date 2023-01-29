package Gun34._01_Ornek1;

public class Otobus extends Arac{
    private int yolcuKapasitesi;

    public Otobus(String renk, String motorHacmi, String marka, int yolcuKapasitesi) {
        super(renk, motorHacmi, marka);
        setYolcuKapasitesi(yolcuKapasitesi); // constructor a da ekleme yapıyoruz.
    }
    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    @Override
    public String toString() {
        return super.toString()+getYolcuKapasitesi();
    }
}
