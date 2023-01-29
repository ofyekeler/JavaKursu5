package Mentoring.mentoring_9.inheritance_ornek1;

public class Kisi {

    private String isim;

    private int yas;

    private int telefonNo;

    private String adres;

    private double maas;

    public Kisi(String isim, int yas, int telefonNo, String adres, double maas) {
        setIsim(isim);
        setYas(yas);
        setTelefonNo(telefonNo);
        setAdres(adres);
        setMaas(maas);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas < 18){
            System.out.println(yas + " yaş bu pozisyon için uygun değil!!!");
        }else {
            this.yas = yas;
        }
    }

    public int getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(int telefonNo) {
        this.telefonNo = telefonNo;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        if (maas <= 0){
            System.out.println("maaş sıfır veya sıfırdan küçük olamaz !!!");
        }else {
            this.maas = maas;
        }
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "isim='" + isim + '\'' +
                ", yas=" + yas +
                ", telefonNo=" + telefonNo +
                ", adres='" + adres + '\'' +
                ", maas=" + maas +
                '}';
    }
}
