package Mentoring.mentoring_10.Java_abstract;

public abstract class Sekil {

    String renk;

    static int sekilSayisi;

    public Sekil(String renk) {
        this.renk = renk;
        sekilSayisi++;  // her nesne oluşturdukça bir arttır
    }

    abstract double alanHesapla();

    public String renkYaz(){
        return renk;
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "şekil sayısı='" + sekilSayisi + '\'' +
                "renk='" + renk + '\'' +
                '}';
    }
}
