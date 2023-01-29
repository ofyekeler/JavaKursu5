package Mentoring.mentoring_9.inheritance_ornek1;

public class Yonetici extends Kisi{

    private String depertman;

    public Yonetici(String isim, int yas, int telefonNo, String adres, double maas, String depertman) {
        super(isim, yas, telefonNo, adres, maas);
        this.depertman = depertman;

    }

    @Override
    public String toString() {
        return "Yonetici{" +
                super.toString() + " " +
                "depertman='" + depertman + '\'' +
                '}';
    }
}
