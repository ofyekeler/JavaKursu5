package Mentoring.mentoring_9.inheritance_ornek2;

public class ZirhliArac {

    private String ad;

    private int menzil;

    private String yakitTipi;

    private boolean paletVarmi;

    public void gorev() {
        System.out.println("Araç göreve hazır");
    }

    public ZirhliArac(String ad, int menzil, String yakitTipi, boolean paletVarmi) {
        setAd(ad);
        setMenzil(menzil);
        setYakitTipi(yakitTipi);
        setPaletVarmi(paletVarmi);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getMenzil() {
        return menzil;
    }

    public void setMenzil(int menzil) {
        this.menzil = menzil;
    }

    public String getYakitTipi() {
        return yakitTipi;
    }

    public void setYakitTipi(String yakitTipi) {
        this.yakitTipi = yakitTipi;
    }

    public boolean isPaletVarmi() {
        return paletVarmi;
    }

    public void setPaletVarmi(boolean paletVarmi) {
        this.paletVarmi = paletVarmi;
    }

    @Override
    public String toString() {
        return "ZirhliArac{" +
                "ad='" + ad + '\'' +
                ", menzil=" + menzil +
                ", yakitTipi='" + yakitTipi + '\'' +
                ", paletVarmi=" + paletVarmi +
                '}';
    }
}
