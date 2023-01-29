package aOdevler._Odev_2023_01_16_Abstract.Soru4;

public abstract class Data {
    abstract double getArea();

    final double pi=3.14;

    private int yaricapi;
    private int boyu;
    private int eni;

    public int getYaricapi() {
        return yaricapi;
    }

    public void setYaricapi(int yaricapi) {
        this.yaricapi = yaricapi;
    }

    public int getBoyu() {
        return boyu;
    }

    public void setBoyu(int boyu) {
        this.boyu = boyu;
    }

    public int getEni() {
        return eni;
    }

    public void setEni(int eni) {
        this.eni = eni;
    }
}