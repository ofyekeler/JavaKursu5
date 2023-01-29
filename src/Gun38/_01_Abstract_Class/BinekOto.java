package Gun38._01_Abstract_Class;

// ABSTRACT CLASS: 2 si bir arada => 1 interface +1 parent class = Abstract Class

public abstract class BinekOto {
    private String marka;
    private int uretimYili;
    private int vitesAdedi;

    public BinekOto(String marka, int uretimYili, int vitesAdedi) {
        setMarka(marka);
        setUretimYili(uretimYili);
        setVitesAdedi(vitesAdedi);
    }

    abstract int HizlanmaSurei(); // INTERFACE i buraya ekledim !!!
      // IBinekOto interface e gerek kalmıyor. Bu yöntemde IBinekOto yu silebilirsin.

    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public int getUretimYili() {
        return uretimYili;
    }
    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }
    public int getVitesAdedi() {
        return vitesAdedi;
    }
    public void setVitesAdedi(int vitesAdedi) {
        this.vitesAdedi = vitesAdedi;
    }
}
