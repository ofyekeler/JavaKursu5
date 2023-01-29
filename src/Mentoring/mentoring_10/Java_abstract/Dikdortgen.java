package Mentoring.mentoring_10.Java_abstract;

public class Dikdortgen extends Sekil {

    private int uzunluk;

    private int genislik;

    public Dikdortgen(String renk, int uzunluk, int genislik) {
        super(renk);
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    @Override
    double alanHesapla() {
        return uzunluk * genislik;
    }

    @Override
    public String toString() {
        return "Dikdortgen{" +
                super.toString() + " " +
                "uzunluk=" + uzunluk +
                ", genislik=" + genislik + " " +
                "alan=" + alanHesapla() + " " +
                '}';
    }
}
