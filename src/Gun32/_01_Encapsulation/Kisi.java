package Gun32._01_Encapsulation;

public class Kisi {
    private String ad;
    private String soyad;
    private int yas; // korumaya aldım

    void setYas(int yas){
        if (yas>0 && yas<150)
            this.yas=yas;
        else
            System.out.println("hatalı yas");
    }
    int getYas(){
        return this.yas;
    }

    void setAd(String ad){
        if(ad.length()<25)
            this.ad=ad;
        else
            System.out.println("hatalı ad");
    }
    String getAd(){
        return this.ad;
    }

    void setSoyad(String soyad){
        if(soyad.length()<25)
            this.soyad=soyad;
        else
            System.out.println("hatalı soyad");
    }
    String getSoyad(){
        return this.soyad;
    }


    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}
