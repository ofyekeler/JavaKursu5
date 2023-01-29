package Gun38._02_Ornek1;

public class Daire extends Sekil{
    private double yaricap;

    public Daire(double yaricap) {
        setYaricap(yaricap);
    }
    @Override
    public double alan() {
        return Math.PI*yaricap*yaricap;
    }
    @Override
    public double cevre() {
        return Math.PI*yaricap;
    }
    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }
}
