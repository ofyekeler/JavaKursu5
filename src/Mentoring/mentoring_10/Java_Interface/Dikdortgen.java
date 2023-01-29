package Mentoring.mentoring_10.Java_Interface;

public class Dikdortgen implements ISekil {

    private int uzunluk;
    private int genislik;
    private String renk;

    public Dikdortgen(int uzunluk, int genislik, String renk) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
        this.renk = renk;
    }

    @Override
    public double alanHesapla() {
        return uzunluk * genislik;
    }
    @Override
    public double cevre() {
        return 2 * ( uzunluk + genislik);
    }

    @Override
    public String toString() {
        return "Dikdortgen{" +
                "uzunluk=" + uzunluk +
                ", genislik=" + genislik +
                ", renk='" + renk + '\'' +
                "alan=" + alanHesapla() + " " +
                "cevre=" + cevre() + " " +
                '}';
    }
}
