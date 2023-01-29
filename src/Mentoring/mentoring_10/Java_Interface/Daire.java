package Mentoring.mentoring_10.Java_Interface;

public class Daire implements ISekil{

    private int yariCap;

    private String renk;

    public Daire(int yariCap, String renk) {
        this.yariCap = yariCap;
        this.renk = renk;
    }

    @Override
    public double alanHesapla() {
        return Math.PI * yariCap * yariCap;
    }

    @Override
    public double cevre() {
        return 2 * Math.PI * yariCap;
    }

    @Override
    public String toString() {
        return "Daire{" +
                "yariCap=" + yariCap +
                ", renk='" + renk + '\'' +
                "alan=" + alanHesapla() + " " +
                "cevre=" + cevre() + " " +
                '}';
    }
}
