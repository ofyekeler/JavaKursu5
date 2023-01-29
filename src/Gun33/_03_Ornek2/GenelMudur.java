package Gun33._03_Ornek2;

public class GenelMudur extends Calisan{
    private double tazminat;

    public GenelMudur(String isim, double maas, double maasKatSayisi,double tazminat) {
        super(isim, maas, maasKatSayisi);
        setTazminat(tazminat);
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla()+getTazminat();
    }
    public double getTazminat() {
        return tazminat;
    }
    public void setTazminat(double tazminat) {
        this.tazminat = tazminat;
    }

    @Override
    public String toString() {
        return "GenelMudur{" +
                "isim= '" + getIsim()+ '\'' +
                ", maas= " + getMaas() +
                ", maasKatSayisi= " + getMaasKatSayisi() +
                ", tazminat= " + getTazminat() + // tazminat da diyebiliriz
                ", ödenecek maas= " + maasHesapla() +
                '}';
    }
}
