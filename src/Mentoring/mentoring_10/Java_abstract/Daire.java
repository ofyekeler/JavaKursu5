package Mentoring.mentoring_10.Java_abstract;

public class Daire extends Sekil {

    private int yariCap;
    public Daire(String renk, int yariCap) {
        super(renk);
        this.yariCap = yariCap;
    }

    @Override
    double alanHesapla() {
        return Math.PI * yariCap * yariCap;
    }

    @Override
    public String toString() {
        return "Daire{" +
                super.toString() + " "+
                "yariCap=" + yariCap + " " +
                "alan=" + alanHesapla() + " "+
                '}';
    }


}
