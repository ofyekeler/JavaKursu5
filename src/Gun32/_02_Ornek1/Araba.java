package Gun32._02_Ornek1;

public class Araba {
   private String renk;
   private int model;
   private double motorHacmi;
   private int kapiSayisi;

/*arb1*/public Araba(){
   }
/*arb2*/public Araba(String renk, int model, double motorHacmi, int kapiSayisi) {
      setRenk(renk);
      setModel(model);
      setMotorHacmi(motorHacmi);
      setKapiSayisi(kapiSayisi);
      //  this.renk = renk;
      //  this.model = model;
      //  this.motorHacmi = motorHacmi;
      //  this.kapiSayisi = kapiSayisi;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model=" + model +
                ", motorHacmi=" + motorHacmi +
                ", kapiSayisi=" + kapiSayisi +
                '}';
    }
// KISAYOL: Generate -> "GETTER and SETTER"
    public String getRenk() {
        return renk;
    }
    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getModel() {
        return model;
    }
    public void setModel(int model) {
        if (model<2023)
        this.model = model;
        else System.out.println("Hatalı model girdiniz.");
    }

    public double getMotorHacmi() {
        return motorHacmi;
    }
    public void setMotorHacmi(double motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }
    public void setKapiSayisi(int kapiSayisi) {
        if (kapiSayisi<7)
        this.kapiSayisi = kapiSayisi;
        else System.out.println("Hatalı kapı sayısı girdiniz.");
    }
}
