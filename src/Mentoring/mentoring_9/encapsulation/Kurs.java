package Mentoring.mentoring_9.encapsulation;

public class Kurs {

    private String ad;

    private int kisiSayisi;

    public Kurs(String ad, int kisiSayisi) {
        setAd(ad);
        setKisiSayisi(kisiSayisi);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getKisiSayisi() {
        return kisiSayisi;
    }

    public void setKisiSayisi(int kisiSayisi) {
        if (kisiSayisi <= 30){
            System.out.println("Bu kurs için yetersiz kişi sayısı !!!");
        }else {
            this.kisiSayisi = kisiSayisi;
        }
    }


    @Override
    public String toString() {
        return "Kurs{" +
                "ad='" + ad + '\'' +
                ", kisiSayisi=" + kisiSayisi +
                '}';
    }
}
