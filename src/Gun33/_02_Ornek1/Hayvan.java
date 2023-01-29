package Gun33._02_Ornek1;

public class Hayvan {
    private String renk;
    private int kilo;
    private String cinsi;

    public Hayvan(String renk, int kilo, String cinsi) {
    //  this.renk = renk;  // Get-Set kullandığında bu düzeltmeleri mutlaka yap.
        setRenk(renk);
    //  this.kilo = kilo;
        setKilo(kilo);
    //  this.cinsi = cinsi;
        setCinsi(cinsi);
    }

    public void konustu(){
        System.out.println("Ses çıkardı.");
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }
}
