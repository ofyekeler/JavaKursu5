package Gun38._02_Ornek1;

public class Dikdortgen extends Sekil{
    private double kisaKenar;
    private double uzunKenar;

    public Dikdortgen(double kisaKenar, double uzunKenar) {
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }
    @Override
    public double alan() {
        return this.kisaKenar*this.uzunKenar;
    }
    @Override
    public double cevre() {
        return (this.kisaKenar+this.uzunKenar)*2;
    }

    public double getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(double kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }
}
