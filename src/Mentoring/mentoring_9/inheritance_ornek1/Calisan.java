package Mentoring.mentoring_9.inheritance_ornek1;

public class Calisan extends Kisi {

    private String uzmanlik;

    public Calisan(String isim, int yas, int telefonNo, String adres, double maas, String uzmanlik) {
        super(isim, yas, telefonNo, adres, maas);
        this.uzmanlik = uzmanlik;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                super.toString() + " " +
                "uzmanlik='" + uzmanlik + '\'' +
                '}';
    }


}
